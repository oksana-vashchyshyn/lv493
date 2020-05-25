package com.softserve.edu.greencity.rest.tests;

import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.softserve.edu.greencity.rest.data.NewsItems;
import com.softserve.edu.greencity.rest.data.User;
import com.softserve.edu.greencity.rest.data.UserGoal;
import com.softserve.edu.greencity.rest.data.UserRepository;
import com.softserve.edu.greencity.rest.entity.NewsEntity;
import com.softserve.edu.greencity.rest.entity.TagsEntity;
import com.softserve.edu.greencity.rest.services.MyCabinetService;
import com.softserve.edu.greencity.rest.services.NewsService;
import com.softserve.edu.greencity.rest.services.TagsService;

public class EcoNewsTest extends GreencityRestTestRunner {
	
	@DataProvider
	public Object[][] users() {
		return new Object[][] { { UserRepository.get().temporary() } };
	}
	
	//@Test(dataProvider = "users")
	public void checkAllTags(User user) {
		logger.info("Start checkAllTags(" + user + ")");
		TagsService tagsService = loadApplication()
				.successfulUserLogin(user)
				.gotoTagsService();
		System.out.println("logginedUserEntity = "
				+ tagsService.getLogginedUserEntity());
		List<TagsEntity> tagsEntity = tagsService.getTags();
		System.out.println("***tagsEntity = "+ tagsEntity);
//		Assert.assertEquals(logginedUserService.getLogginedUserEntity().getName(),
//				user.getName());
	}
	
	@Test(dataProvider = "users")
	public void checkFreshNews(User user) {
		logger.info("Start checkFreshNews(" + user + ")");
		NewsService newsService = loadApplication()
				.successfulUserLogin(user)
				.gotoNewsService();
		System.out.println("newsService  = "
				+ newsService.getLogginedUserEntity());
//		List<NewsItems> newsItems = newsService.getNewsEntity();
		List<NewsEntity> newsEntity = newsService.getNewsEntity();
		System.out.println("***newsEntity = "+  newsEntity);
//		Assert.assertEquals(logginedUserService.getLogginedUserEntity().getName(),
//				user.getName());
	}

}
