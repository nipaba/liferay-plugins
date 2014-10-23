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

package com.liferay.pushnotifications.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the PushNotificationsEntry service. Represents a row in the &quot;PushNotificationsEntry&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.pushnotifications.model.impl.PushNotificationsEntryModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.pushnotifications.model.impl.PushNotificationsEntryImpl}.
 * </p>
 *
 * @author Bruno Farache
 * @see PushNotificationsEntry
 * @see com.liferay.pushnotifications.model.impl.PushNotificationsEntryImpl
 * @see com.liferay.pushnotifications.model.impl.PushNotificationsEntryModelImpl
 * @generated
 */
public interface PushNotificationsEntryModel extends BaseModel<PushNotificationsEntry> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a push notifications entry model instance should use the {@link PushNotificationsEntry} interface instead.
	 */

	/**
	 * Returns the primary key of this push notifications entry.
	 *
	 * @return the primary key of this push notifications entry
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this push notifications entry.
	 *
	 * @param primaryKey the primary key of this push notifications entry
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the push notifications entry ID of this push notifications entry.
	 *
	 * @return the push notifications entry ID of this push notifications entry
	 */
	public long getPushNotificationsEntryId();

	/**
	 * Sets the push notifications entry ID of this push notifications entry.
	 *
	 * @param pushNotificationsEntryId the push notifications entry ID of this push notifications entry
	 */
	public void setPushNotificationsEntryId(long pushNotificationsEntryId);

	/**
	 * Returns the user ID of this push notifications entry.
	 *
	 * @return the user ID of this push notifications entry
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this push notifications entry.
	 *
	 * @param userId the user ID of this push notifications entry
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this push notifications entry.
	 *
	 * @return the user uuid of this push notifications entry
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this push notifications entry.
	 *
	 * @param userUuid the user uuid of this push notifications entry
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the create time of this push notifications entry.
	 *
	 * @return the create time of this push notifications entry
	 */
	public long getCreateTime();

	/**
	 * Sets the create time of this push notifications entry.
	 *
	 * @param createTime the create time of this push notifications entry
	 */
	public void setCreateTime(long createTime);

	/**
	 * Returns the parent push notifications entry ID of this push notifications entry.
	 *
	 * @return the parent push notifications entry ID of this push notifications entry
	 */
	public long getParentPushNotificationsEntryId();

	/**
	 * Sets the parent push notifications entry ID of this push notifications entry.
	 *
	 * @param parentPushNotificationsEntryId the parent push notifications entry ID of this push notifications entry
	 */
	public void setParentPushNotificationsEntryId(
		long parentPushNotificationsEntryId);

	/**
	 * Returns the payload of this push notifications entry.
	 *
	 * @return the payload of this push notifications entry
	 */
	@AutoEscape
	public String getPayload();

	/**
	 * Sets the payload of this push notifications entry.
	 *
	 * @param payload the payload of this push notifications entry
	 */
	public void setPayload(String payload);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(PushNotificationsEntry pushNotificationsEntry);

	@Override
	public int hashCode();

	@Override
	public CacheModel<PushNotificationsEntry> toCacheModel();

	@Override
	public PushNotificationsEntry toEscapedModel();

	@Override
	public PushNotificationsEntry toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}