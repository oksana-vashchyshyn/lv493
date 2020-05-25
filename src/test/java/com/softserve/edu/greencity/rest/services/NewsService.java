package com.softserve.edu.greencity.rest.services;

import java.util.List;

import com.softserve.edu.greencity.rest.data.NewsItems;
import com.softserve.edu.greencity.rest.data.UserGoal;
import com.softserve.edu.greencity.rest.dto.ContentTypes;
import com.softserve.edu.greencity.rest.dto.KeyParameters;
import com.softserve.edu.greencity.rest.dto.MethodParameters;
import com.softserve.edu.greencity.rest.dto.RestParameters;
import com.softserve.edu.greencity.rest.entity.LogginedUserEntity;
import com.softserve.edu.greencity.rest.entity.NewsEntity;
import com.softserve.edu.greencity.rest.entity.UserGoalsEntity;
import com.softserve.edu.greencity.rest.resources.NewsResource;


public class NewsService extends LogginedUserService {
		private NewsResource newsResource;

		public NewsService(LogginedUserEntity logginedUserEntity) {
			super(logginedUserEntity);
			newsResource = new NewsResource();
		}

		// getters

		public NewsResource getNewsResource() {
			return newsResource;
		}

		// Functionals
		
//		public List<NewsItems> getNewsEntity() {
		public List<NewsEntity> getNewsEntity() {
	    	MethodParameters methodParameters = new MethodParameters();
	    	RestParameters headerParameters = new RestParameters()
					.addParameter(KeyParameters.ACCEPT, ContentTypes.ALL_TYPES.toString())
					.addParameter(KeyParameters.AUTHORIZATION,
							KeyParameters.BEARER.toString() + getLogginedUserEntity().getAccessToken());
	    	
	    	List<NewsEntity> newsEntities = newsResource
	    			.httpGetAsListEntity(methodParameters
	    					.addHeaderParameters(headerParameters));
	    	System.out.println("***newsEntities = " + newsEntities);
//			return NewsItems.converToNewsItemsList(newsEntities);
			return newsEntities;
		}

		
		// Business Logic

}
