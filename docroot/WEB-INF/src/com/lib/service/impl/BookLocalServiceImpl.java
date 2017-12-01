/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.lib.service.impl;

import java.util.List;

import com.lib.model.Book;
import com.lib.service.BookLocalServiceUtil;
import com.lib.service.base.BookLocalServiceBaseImpl;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Junction;
import com.liferay.portal.kernel.dao.orm.Property;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.Validator;

/**
 * The implementation of the book local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.lib.service.BookLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Nam
 * @see com.lib.service.base.BookLocalServiceBaseImpl
 * @see com.lib.service.BookLocalServiceUtil
 */
public class BookLocalServiceImpl extends BookLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link
	 * com.lib.service.BookLocalServiceUtil} to access the book local service.
	 */

	public List getSearchBooks(String title, String description, boolean andSearch, int start, int end, OrderByComparator orderByComparator)
			throws com.liferay.portal.kernel.exception.SystemException {
		DynamicQuery dynamicQuery = buildBookDynamicQuery(title, description, andSearch);
		return BookLocalServiceUtil.dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	public int getSearchBooksCount(String title, String description, boolean andSearch) throws com.liferay.portal.kernel.exception.SystemException {
		DynamicQuery dynamicQuery = buildBookDynamicQuery(title, description, andSearch);
		return (int) BookLocalServiceUtil.dynamicQueryCount(dynamicQuery);
	}

	protected DynamicQuery buildBookDynamicQuery(String title, String description, boolean andSearch) {
		Junction junction = null;
		if (andSearch)
			junction = RestrictionsFactoryUtil.conjunction();
		else
			junction = RestrictionsFactoryUtil.disjunction();

		if (Validator.isNotNull(title)) {
			Property property = PropertyFactoryUtil.forName("title");
			String value = (new StringBuilder("%")).append(title).append("%").toString();
			junction.add(property.like(value));
		}
		if (Validator.isNotNull(description)) {
			Property property = PropertyFactoryUtil.forName("description");
			String value = (new StringBuilder("%")).append(description).append("%").toString();
			junction.add(property.like(value));
		}
		
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(Book.class, getClassLoader());
		return dynamicQuery.add(junction);
	}
}