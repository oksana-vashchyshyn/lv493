package com.softserve.edu.greencity.rest.services;

import java.util.List;

import com.softserve.edu.greencity.rest.dto.ContentTypes;
import com.softserve.edu.greencity.rest.dto.KeyParameters;
import com.softserve.edu.greencity.rest.dto.MethodParameters;
import com.softserve.edu.greencity.rest.dto.RestParameters;
import com.softserve.edu.greencity.rest.entity.LogginedUserEntity;
import com.softserve.edu.greencity.rest.entity.TagsEntity;
import com.softserve.edu.greencity.rest.resources.TagsResurses;



public class TagsService extends LogginedUserService {
	
	private TagsResurses tagsResurses;

	public TagsService(LogginedUserEntity logginedUserEntity) {
		super(logginedUserEntity);
		tagsResurses = new TagsResurses();
	}

	// getters
	
	public TagsResurses getTagsResurses() {
		return tagsResurses;
	}

// Business Logic

	public List<TagsEntity> getTags() {
    	MethodParameters methodParameters = new MethodParameters();
    	RestParameters headerParameters = new RestParameters()
				.addParameter(KeyParameters.ACCEPT, ContentTypes.ALL_TYPES.toString())
				.addParameter(KeyParameters.AUTHORIZATION,
						KeyParameters.BEARER.toString() + getLogginedUserEntity().getAccessToken());
    	List<TagsEntity> tagsEntity = tagsResurses.httpGetAsListEntity(methodParameters
    					.addHeaderParameters(headerParameters));
    					 					
		return tagsEntity;
	}


}
