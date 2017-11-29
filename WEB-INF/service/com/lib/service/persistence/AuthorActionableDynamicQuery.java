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

package com.lib.service.persistence;

import com.lib.model.Author;

import com.lib.service.AuthorLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Nam
 * @generated
 */
public abstract class AuthorActionableDynamicQuery
	extends BaseActionableDynamicQuery {
	public AuthorActionableDynamicQuery() throws SystemException {
		setBaseLocalService(AuthorLocalServiceUtil.getService());
		setClass(Author.class);

		setClassLoader(com.lib.service.ClpSerializer.class.getClassLoader());

		setPrimaryKeyPropertyName("authorId");
	}
}