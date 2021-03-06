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

package com.lib.model.impl;

import com.lib.model.Author;
import com.lib.model.AuthorModel;
import com.lib.model.AuthorSoap;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the Author service. Represents a row in the &quot;NewLib_Author&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.lib.model.AuthorModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link AuthorImpl}.
 * </p>
 *
 * @author Nam
 * @see AuthorImpl
 * @see com.lib.model.Author
 * @see com.lib.model.AuthorModel
 * @generated
 */
@JSON(strict = true)
public class AuthorModelImpl extends BaseModelImpl<Author>
	implements AuthorModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a author model instance should use the {@link com.lib.model.Author} interface instead.
	 */
	public static final String TABLE_NAME = "NewLib_Author";
	public static final Object[][] TABLE_COLUMNS = {
			{ "authorId", Types.BIGINT },
			{ "name", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table NewLib_Author (authorId LONG not null primary key,name VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table NewLib_Author";
	public static final String ORDER_BY_JPQL = " ORDER BY author.authorId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY NewLib_Author.authorId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.lib.model.Author"), false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.lib.model.Author"), false);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.lib.model.Author"),
			true);
	public static long NAME_COLUMN_BITMASK = 1L;
	public static long AUTHORID_COLUMN_BITMASK = 2L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static Author toModel(AuthorSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		Author model = new AuthorImpl();

		model.setAuthorId(soapModel.getAuthorId());
		model.setName(soapModel.getName());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<Author> toModels(AuthorSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<Author> models = new ArrayList<Author>(soapModels.length);

		for (AuthorSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final String MAPPING_TABLE_NEWLIB_BOOK_AUTHOR_NAME = "NewLib_Book_Author";
	public static final Object[][] MAPPING_TABLE_NEWLIB_BOOK_AUTHOR_COLUMNS = {
			{ "authorId", Types.BIGINT },
			{ "bookId", Types.BIGINT }
		};
	public static final String MAPPING_TABLE_NEWLIB_BOOK_AUTHOR_SQL_CREATE = "create table NewLib_Book_Author (authorId LONG not null,bookId LONG not null,primary key (authorId, bookId))";
	public static final boolean FINDER_CACHE_ENABLED_NEWLIB_BOOK_AUTHOR = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.NewLib_Book_Author"), true);
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.lib.model.Author"));

	public AuthorModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _authorId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setAuthorId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _authorId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Author.class;
	}

	@Override
	public String getModelClassName() {
		return Author.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("authorId", getAuthorId());
		attributes.put("name", getName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long authorId = (Long)attributes.get("authorId");

		if (authorId != null) {
			setAuthorId(authorId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}
	}

	@JSON
	@Override
	public long getAuthorId() {
		return _authorId;
	}

	@Override
	public void setAuthorId(long authorId) {
		_columnBitmask = -1L;

		_authorId = authorId;
	}

	@JSON
	@Override
	public String getName() {
		if (_name == null) {
			return StringPool.BLANK;
		}
		else {
			return _name;
		}
	}

	@Override
	public void setName(String name) {
		_columnBitmask |= NAME_COLUMN_BITMASK;

		if (_originalName == null) {
			_originalName = _name;
		}

		_name = name;
	}

	public String getOriginalName() {
		return GetterUtil.getString(_originalName);
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			Author.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Author toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Author)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		AuthorImpl authorImpl = new AuthorImpl();

		authorImpl.setAuthorId(getAuthorId());
		authorImpl.setName(getName());

		authorImpl.resetOriginalValues();

		return authorImpl;
	}

	@Override
	public int compareTo(Author author) {
		int value = 0;

		if (getAuthorId() < author.getAuthorId()) {
			value = -1;
		}
		else if (getAuthorId() > author.getAuthorId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Author)) {
			return false;
		}

		Author author = (Author)obj;

		long primaryKey = author.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
		AuthorModelImpl authorModelImpl = this;

		authorModelImpl._originalName = authorModelImpl._name;

		authorModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<Author> toCacheModel() {
		AuthorCacheModel authorCacheModel = new AuthorCacheModel();

		authorCacheModel.authorId = getAuthorId();

		authorCacheModel.name = getName();

		String name = authorCacheModel.name;

		if ((name != null) && (name.length() == 0)) {
			authorCacheModel.name = null;
		}

		return authorCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{authorId=");
		sb.append(getAuthorId());
		sb.append(", name=");
		sb.append(getName());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("com.lib.model.Author");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>authorId</column-name><column-value><![CDATA[");
		sb.append(getAuthorId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = Author.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] { Author.class };
	private long _authorId;
	private String _name;
	private String _originalName;
	private long _columnBitmask;
	private Author _escapedModel;
}