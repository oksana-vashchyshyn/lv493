package com.softserve.edu.greencity.rest.services;


import com.softserve.edu.greencity.rest.data.econews.News;
import com.softserve.edu.greencity.rest.data.econews.PageParameters;
import com.softserve.edu.greencity.rest.dto.ContentTypes;
import com.softserve.edu.greencity.rest.dto.KeyParameters;
import com.softserve.edu.greencity.rest.dto.MethodParameters;
import com.softserve.edu.greencity.rest.dto.RestParameters;
import com.softserve.edu.greencity.rest.entity.LogginedUserEntity;
import com.softserve.edu.greencity.rest.entity.ResponseCodeEntity;
import com.softserve.edu.greencity.rest.entity.econewsEntity.NewsEntity;
import com.softserve.edu.greencity.rest.entity.econewsEntity.PageEntity;
import com.softserve.edu.greencity.rest.resources.econews.*;

import java.util.List;


public class EconewsUserService extends LogginedUserService {

    private NewestNewsResource newestNewsResource;
    private TagsResurse tagsResurse;
    private PageResourse pageResource;
    protected EconewsResource econewsResource;
    protected EconewsTagsResource econewsTagsResource;

    public EconewsUserService(LogginedUserEntity logginedUserEntity) {
        super(logginedUserEntity);
        newestNewsResource = new NewestNewsResource();
        tagsResurse = new TagsResurse();
        pageResource = new PageResourse();
        econewsResource = new EconewsResource();
        econewsTagsResource = new EconewsTagsResource();
    }

    // getters

    public NewestNewsResource getNewestNewsResource() {
        return newestNewsResource;
    }

    public TagsResurse gettagsResurse() {
        return tagsResurse;
    }

    public PageResourse getPageResource() {
        return pageResource;
    }

    // Functionals

    //	public List<NewsItems> getNewsEntity() {
    public List<NewsEntity> getNewsEntity() {
        MethodParameters methodParameters = new MethodParameters();
        RestParameters headerParameters = new RestParameters()
                .addParameter(KeyParameters.ACCEPT, ContentTypes.ALL_TYPES.toString())
                .addParameter(KeyParameters.AUTHORIZATION,
                        KeyParameters.BEARER.toString() + getLogginedUserEntity().getAccessToken());

        List<NewsEntity> newsEntities = newestNewsResource
                .httpGetAsListEntity(methodParameters
                        .addHeaderParameters(headerParameters));

        System.out.println("***newsEntities = " + newsEntities);
//		return NewsItems.converToNewsItemsList(newsEntities);
        return newsEntities;
    }

    public String getTags() {
        MethodParameters methodParameters = new MethodParameters();
        RestParameters headerParameters = new RestParameters()
                .addParameter(KeyParameters.ACCEPT, ContentTypes.ALL_TYPES.toString())
                .addParameter(KeyParameters.AUTHORIZATION,
                        KeyParameters.BEARER.toString() + getLogginedUserEntity().getAccessToken());
        String tagsEntity = tagsResurse
                .httpGetAsEntity(methodParameters
                        .addHeaderParameters(headerParameters));

        return tagsEntity;
    }

    public PageEntity getPageEntity(PageParameters pageParameters) {
        MethodParameters methodParameters = new MethodParameters();
        RestParameters headerParameters = new RestParameters()
                .addParameter(KeyParameters.ACCEPT, ContentTypes.ALL_TYPES.toString())
                .addParameter(KeyParameters.AUTHORIZATION,
                        KeyParameters.BEARER.toString() + getLogginedUserEntity().getAccessToken());
        RestParameters urlParameters = new RestParameters()
                .addParameter(KeyParameters.PAGE, pageParameters.getPage())
                .addParameter(KeyParameters.SIZE, pageParameters.getSize());
        PageEntity pageEntity = pageResource
                .httpGetAsEntity(methodParameters
                        .addUrlParameters(urlParameters)
                        .addHeaderParameters(headerParameters));
        //   			.httpGetAsListEntity(methodParameters
        //   					.addHeaderParameters(headerParameters));
        System.out.println("***pageEntity = " + pageEntity);
//		return NewsItems.converToNewsItemsList(newsEntities);
        return pageEntity;
    }


    public int deleteNews(String id) { // available only for admin
        RestParameters pathVariables = new RestParameters()
                .addParameter(KeyParameters.ECONEWS_ID, id);

        MethodParameters methodParameters = new MethodParameters();

        RestParameters headerParameters = new RestParameters()
                .addParameter(KeyParameters.ACCEPT, ContentTypes.ALL_TYPES.toString())
                .addParameter(KeyParameters.AUTHORIZATION,
                        KeyParameters.BEARER.toString() + getLogginedUserEntity().getAccessToken());
        ResponseCodeEntity responseCode = econewsResource
                .httpDeleteAsEntity(methodParameters
                        .addHeaderParameters(headerParameters)
                        .addPathVariables(pathVariables));
        return responseCode.getResponsecode();
    }

    public int createNews(News news) {
        MethodParameters methodParameters = new MethodParameters()
                .addContentType(ContentTypes.MULTIPART_FORM_DATA);

        RestParameters headerParameters = new RestParameters()
                .addParameter(KeyParameters.AUTHORIZATION,
                        KeyParameters.BEARER.toString() + getLogginedUserEntity().getAccessToken())
                .addParameter(KeyParameters.ACCEPT, ContentTypes.ALL_TYPES.toString());

        RestParameters mediaTypeParameters = new RestParameters()
                .addParameter(KeyParameters.ADD_ECONEWS_DTO_REQUEST, "{\"tags\": [\"news\"], \"text\": \"Text test\", \"title\": \"Test title 25\"}");

        NewsEntity econewsService = econewsResource
                .httpPostAsEntity(methodParameters
                        .addHeaderParameters(headerParameters)
                        .addMediaTypeParameters(mediaTypeParameters));
        return econewsService.getId();
    }
    // Business Logic

    
    // TODO
//    public NewsEntity uploadNews() {
//        MethodParameters methodParameters = new MethodParameters()
//                .addContentType(ContentTypes.IMAGE_JPEG)
//                .addFormDataPartKey(KeyParameters.ECO_NEWS_DTO);
//        FileUploadParameters fileUploadParameters = new FileUploadParameters("image", "@111.jpg", "D:\\Title1.jpeg");
//        RestParameters formDataPartParameters = new RestParameters()
//                .addParameter(KeyParameters.IMAGE_PATH, "string0")
//                .addParameter(KeyParameters.SOURCE, "string1")
//                .addParameter(KeyParameters.TAGS, "news")
//                .addParameter(KeyParameters.TEXT, "string12345string1234500044")
//                .addParameter(KeyParameters.TITLE, "string2");
//        NewsEntity newsEntity = econewsResource
//                .httpPostAsEntity(methodParameters
//                        .addFileUploadParameters(fileUploadParameters)
//                        .addFormDataPartParameters(formDataPartParameters));
//        return newsEntity;
//    }

}
