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

import com.lib.model.Book;
import com.lib.model.BookModel;
import com.lib.model.BookSoap;

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
 * The base model implementation for the Book service. Represents a row in the &quot;NewLib_Book&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.lib.model.BookModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link BookImpl}.
 * </p>
 *
 * @author Nam
 * @see BookImpl
 * @see com.lib.model.Book
 * @see com.lib.model.BookModel
 * @generated
 */
@JSON(strict = true)
public class BookModelImpl extends BaseModelImpl<Book> implements BookModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a book model instance should use the {@link com.lib.model.Book} interface instead.
	 */
	public static final String TABLE_NAME = "NewLib_Book";
	public static final Object[][] TABLE_COLUMNS = {
			{ "bookId", Types.BIGINT },
			{ "title", Types.VARCHAR },
			{ "description", Types.VARCHAR },
			{ "imageUrl", Types.VARCHAR },
			{ "category", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table NewLib_Book (bookId LONG not null primary key,title VARCHAR(75) null,description VARCHAR(75) null,imageUrl VARCHAR(75) null,category VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table NewLib_Book";
	public static final String ORDER_BY_JPQL = " ORDER BY book.bookId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY NewLib_Book.bookId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.lib.model.Book"), false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.lib.model.Book"), false);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.lib.model.Book"), true);
	public static long TITLE_COLUMN_BITMASK = 1L;
	public static long BOOKID_COLUMN_BITMASK = 2L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static Book toModel(BookSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		Book model = new BookImpl();

		model.setBookId(soapModel.getBookId());
		model.setTitle(soapModel.getTitle());
		model.setDescription(soapModel.getDescription());
		model.setImageUrl(soapModel.getImageUrl());
		model.setCategory(soapModel.getCategory());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<Book> toModels(BookSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<Book> models = new ArrayList<Book>(soapModels.length);

		for (BookSoap soapModel : soapModels) {
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
				"lock.expiration.time.com.lib.model.Book"));

	public BookModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _bookId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setBookId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _bookId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Book.class;
	}

	@Override
	public String getModelClassName() {
		return Book.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("bookId", getBookId());
		attributes.put("title", getTitle());
		attributes.put("description", getDescription());
		attributes.put("imageUrl", getImageUrl());
		attributes.put("category", getCategory());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long bookId = (Long)attributes.get("bookId");

		if (bookId != null) {
			setBookId(bookId);
		}

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		String imageUrl = (String)attributes.get("imageUrl");

		if (imageUrl != null) {
			setImageUrl(imageUrl);
		}

		String category = (String)attributes.get("category");

		if (category != null) {
			setCategory(category);
		}
	}

	@JSON
	@Override
	public long getBookId() {
		return _bookId;
	}

	@Override
	public void setBookId(long bookId) {
		_columnBitmask = -1L;

		_bookId = bookId;
	}

	@JSON
	@Override
	public String getTitle() {
		if (_title == null) {
			return StringPool.BLANK;
		}
		else {
			return _title;
		}
	}

	@Override
	public void setTitle(String title) {
		_columnBitmask |= TITLE_COLUMN_BITMASK;

		if (_originalTitle == null) {
			_originalTitle = _title;
		}

		_title = title;
	}

	public String getOriginalTitle() {
		return GetterUtil.getString(_originalTitle);
	}

	@JSON
	@Override
	public String getDescription() {
		if (_description == null) {
			return StringPool.BLANK;
		}
		else {
			return _description;
		}
	}

	@Override
	public void setDescription(String description) {
		_description = description;
	}

	@JSON
	@Override
	public String getImageUrl() {
		if (_imageUrl == null) {
			return StringPool.BLANK;
		}
		else {
			return _imageUrl;
		}
	}

	@Override
	public void setImageUrl(String imageUrl) {
		_imageUrl = imageUrl;
	}

	@JSON
	@Override
	public String getCategory() {
		if (_category == null) {
			return StringPool.BLANK;
		}
		else {
			return _category;
		}
	}

	@Override
	public void setCategory(String category) {
		_category = category;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			Book.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Book toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Book)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		BookImpl bookImpl = new BookImpl();

		bookImpl.setBookId(getBookId());
		bookImpl.setTitle(getTitle());
		bookImpl.setDescription(getDescription());
		bookImpl.setImageUrl(getImageUrl());
		bookImpl.setCategory(getCategory());

		bookImpl.resetOriginalValues();

		return bookImpl;
	}

	@Override
	public int compareTo(Book book) {
		int value = 0;

		if (getBookId() < book.getBookId()) {
			value = -1;
		}
		else if (getBookId() > book.getBookId()) {
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

		if (!(obj instanceof Book)) {
			return false;
		}

		Book book = (Book)obj;

		long primaryKey = book.getPrimaryKey();

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
		BookModelImpl bookModelImpl = this;

		bookModelImpl._originalTitle = bookModelImpl._title;

		bookModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<Book> toCacheModel() {
		BookCacheModel bookCacheModel = new BookCacheModel();

		bookCacheModel.bookId = getBookId();

		bookCacheModel.title = getTitle();

		String title = bookCacheModel.title;

		if ((title != null) && (title.length() == 0)) {
			bookCacheModel.title = null;
		}

		bookCacheModel.description = getDescription();

		String description = bookCacheModel.description;

		if ((description != null) && (description.length() == 0)) {
			bookCacheModel.description = null;
		}

		bookCacheModel.imageUrl = getImageUrl();

		String imageUrl = bookCacheModel.imageUrl;

		if ((imageUrl != null) && (imageUrl.length() == 0)) {
			bookCacheModel.imageUrl = null;
		}

		bookCacheModel.category = getCategory();

		String category = bookCacheModel.category;

		if ((category != null) && (category.length() == 0)) {
			bookCacheModel.category = null;
		}

		return bookCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{bookId=");
		sb.append(getBookId());
		sb.append(", title=");
		sb.append(getTitle());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", imageUrl=");
		sb.append(getImageUrl());
		sb.append(", category=");
		sb.append(getCategory());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(19);

		sb.append("<model><model-name>");
		sb.append("com.lib.model.Book");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>bookId</column-name><column-value><![CDATA[");
		sb.append(getBookId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>title</column-name><column-value><![CDATA[");
		sb.append(getTitle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>imageUrl</column-name><column-value><![CDATA[");
		sb.append(getImageUrl());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>category</column-name><column-value><![CDATA[");
		sb.append(getCategory());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = Book.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] { Book.class };
	private long _bookId;
	private String _title;
	private String _originalTitle;
	private String _description;
	private String _imageUrl;
	private String _category;
	private long _columnBitmask;
	private Book _escapedModel;
}