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

package com.lib.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AuthorLocalService}.
 *
 * @author Nam
 * @see AuthorLocalService
 * @generated
 */
public class AuthorLocalServiceWrapper implements AuthorLocalService,
	ServiceWrapper<AuthorLocalService> {
	public AuthorLocalServiceWrapper(AuthorLocalService authorLocalService) {
		_authorLocalService = authorLocalService;
	}

	/**
	* Adds the author to the database. Also notifies the appropriate model listeners.
	*
	* @param author the author
	* @return the author that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.lib.model.Author addAuthor(com.lib.model.Author author)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _authorLocalService.addAuthor(author);
	}

	/**
	* Creates a new author with the primary key. Does not add the author to the database.
	*
	* @param authorId the primary key for the new author
	* @return the new author
	*/
	@Override
	public com.lib.model.Author createAuthor(long authorId) {
		return _authorLocalService.createAuthor(authorId);
	}

	/**
	* Deletes the author with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param authorId the primary key of the author
	* @return the author that was removed
	* @throws PortalException if a author with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.lib.model.Author deleteAuthor(long authorId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _authorLocalService.deleteAuthor(authorId);
	}

	/**
	* Deletes the author from the database. Also notifies the appropriate model listeners.
	*
	* @param author the author
	* @return the author that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.lib.model.Author deleteAuthor(com.lib.model.Author author)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _authorLocalService.deleteAuthor(author);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _authorLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _authorLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.lib.model.impl.AuthorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _authorLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.lib.model.impl.AuthorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _authorLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _authorLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _authorLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.lib.model.Author fetchAuthor(long authorId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _authorLocalService.fetchAuthor(authorId);
	}

	/**
	* Returns the author with the primary key.
	*
	* @param authorId the primary key of the author
	* @return the author
	* @throws PortalException if a author with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.lib.model.Author getAuthor(long authorId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _authorLocalService.getAuthor(authorId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _authorLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the authors.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.lib.model.impl.AuthorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of authors
	* @param end the upper bound of the range of authors (not inclusive)
	* @return the range of authors
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.lib.model.Author> getAuthors(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _authorLocalService.getAuthors(start, end);
	}

	/**
	* Returns the number of authors.
	*
	* @return the number of authors
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getAuthorsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _authorLocalService.getAuthorsCount();
	}

	/**
	* Updates the author in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param author the author
	* @return the author that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.lib.model.Author updateAuthor(com.lib.model.Author author)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _authorLocalService.updateAuthor(author);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addBookAuthor(long bookId, long authorId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_authorLocalService.addBookAuthor(bookId, authorId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addBookAuthor(long bookId, com.lib.model.Author author)
		throws com.liferay.portal.kernel.exception.SystemException {
		_authorLocalService.addBookAuthor(bookId, author);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addBookAuthors(long bookId, long[] authorIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_authorLocalService.addBookAuthors(bookId, authorIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void addBookAuthors(long bookId,
		java.util.List<com.lib.model.Author> Authors)
		throws com.liferay.portal.kernel.exception.SystemException {
		_authorLocalService.addBookAuthors(bookId, Authors);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void clearBookAuthors(long bookId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_authorLocalService.clearBookAuthors(bookId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteBookAuthor(long bookId, long authorId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_authorLocalService.deleteBookAuthor(bookId, authorId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteBookAuthor(long bookId, com.lib.model.Author author)
		throws com.liferay.portal.kernel.exception.SystemException {
		_authorLocalService.deleteBookAuthor(bookId, author);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteBookAuthors(long bookId, long[] authorIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_authorLocalService.deleteBookAuthors(bookId, authorIds);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void deleteBookAuthors(long bookId,
		java.util.List<com.lib.model.Author> Authors)
		throws com.liferay.portal.kernel.exception.SystemException {
		_authorLocalService.deleteBookAuthors(bookId, Authors);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.lib.model.Author> getBookAuthors(long bookId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _authorLocalService.getBookAuthors(bookId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.lib.model.Author> getBookAuthors(long bookId,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _authorLocalService.getBookAuthors(bookId, start, end);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.lib.model.Author> getBookAuthors(long bookId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _authorLocalService.getBookAuthors(bookId, start, end,
			orderByComparator);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getBookAuthorsCount(long bookId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _authorLocalService.getBookAuthorsCount(bookId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public boolean hasBookAuthor(long bookId, long authorId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _authorLocalService.hasBookAuthor(bookId, authorId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public boolean hasBookAuthors(long bookId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _authorLocalService.hasBookAuthors(bookId);
	}

	/**
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public void setBookAuthors(long bookId, long[] authorIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		_authorLocalService.setBookAuthors(bookId, authorIds);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _authorLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_authorLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _authorLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public AuthorLocalService getWrappedAuthorLocalService() {
		return _authorLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedAuthorLocalService(
		AuthorLocalService authorLocalService) {
		_authorLocalService = authorLocalService;
	}

	@Override
	public AuthorLocalService getWrappedService() {
		return _authorLocalService;
	}

	@Override
	public void setWrappedService(AuthorLocalService authorLocalService) {
		_authorLocalService = authorLocalService;
	}

	private AuthorLocalService _authorLocalService;
}