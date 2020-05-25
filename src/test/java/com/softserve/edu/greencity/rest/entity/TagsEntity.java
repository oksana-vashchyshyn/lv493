package com.softserve.edu.greencity.rest.entity;

import java.util.ArrayList;
import java.util.List;

public class TagsEntity {
	
	private String tag;
	
	public TagsEntity(String tag) {
		this.tag = tag;
	}

	public String getTag() {
		return tag;
	}

	@Override
	public String toString() {
		return "TagsEntity [tags=" + tag + "]";
	}

	public static TagsEntity converToTagsEntity(TagsEntity tagsEntity) {
		return new TagsEntity(tagsEntity.getTag());
	}
	
	public static List<TagsEntity> converToTagsEntityList(TagsEntity... tagsEntities) {
		List<TagsEntity> result = new ArrayList<>();
		for (TagsEntity tagsEntity : tagsEntities) {
			result.add(converToTagsEntity(tagsEntity));
		}
		return result;
	}
		
	}
	
	
	


