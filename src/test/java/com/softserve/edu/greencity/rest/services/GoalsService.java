package com.softserve.edu.greencity.rest.services;

import java.util.List;

import com.softserve.edu.greencity.rest.data.LanguagesCode;
import com.softserve.edu.greencity.rest.dto.MethodParameters;
import com.softserve.edu.greencity.rest.entity.LogginedUserEntity;
import com.softserve.edu.greencity.rest.entity.UserGoalEntity;
import com.softserve.edu.greencity.rest.resources.GoalsResource;

public class GoalsService extends LogginedUserService{
	protected GoalsResource goalsResource;

	public GoalsService(LogginedUserEntity logginedUserEntity) {
		super(logginedUserEntity);
		goalsResource = new GoalsResource();
	}

	// getters

	public GoalsResource getGoalsResource() {
        return goalsResource;
    }

	// Functionals

	public List<UserGoalEntity> allGoals(LanguagesCode language){
        return getGoalsResource().httpGetAsListEntity(new MethodParameters()
                .addHeaderParameters(getHeaderParameters())
                .addUrlParameters(getLanguageParameter(language)));
	}

	public List<UserGoalEntity> allGoals(){
        return allGoals(LanguagesCode.ENGLISH);
    }

}