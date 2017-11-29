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

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Book in entity cache.
 *
 * @author Nam
 * @see Book
 * @generated
 */
public class BookCacheModel implements CacheModel<Book>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{bookId=");
		sb.append(bookId);
		sb.append(", title=");
		sb.append(title);
		sb.append(", description=");
		sb.append(description);
		sb.append(", imageUrl=");
		sb.append(imageUrl);
		sb.append(", category=");
		sb.append(category);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Book toEntityModel() {
		BookImpl bookImpl = new BookImpl();

		bookImpl.setBookId(bookId);

		if (title == null) {
			bookImpl.setTitle(StringPool.BLANK);
		}
		else {
			bookImpl.setTitle(title);
		}

		if (description == null) {
			bookImpl.setDescription(StringPool.BLANK);
		}
		else {
			bookImpl.setDescription(description);
		}

		if (imageUrl == null) {
			bookImpl.setImageUrl(StringPool.BLANK);
		}
		else {
			bookImpl.setImageUrl(imageUrl);
		}

		if (category == null) {
			bookImpl.setCategory(StringPool.BLANK);
		}
		else {
			bookImpl.setCategory(category);
		}

		bookImpl.resetOriginalValues();

		return bookImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		bookId = objectInput.readLong();
		title = objectInput.readUTF();
		description = objectInput.readUTF();
		imageUrl = objectInput.readUTF();
		category = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(bookId);

		if (title == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(title);
		}

		if (description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(description);
		}

		if (imageUrl == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(imageUrl);
		}

		if (category == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(category);
		}
	}

	public long bookId;
	public String title;
	public String description;
	public String imageUrl;
	public String category;
}