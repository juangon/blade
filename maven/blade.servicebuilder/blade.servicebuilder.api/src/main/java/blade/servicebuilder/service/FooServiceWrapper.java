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

package blade.servicebuilder.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link FooService}.
 *
 * @author Brian Wing Shun Chan
 * @see FooService
 * @generated
 */
@ProviderType
public class FooServiceWrapper implements FooService,
	ServiceWrapper<FooService> {
	public FooServiceWrapper(FooService fooService) {
		_fooService = fooService;
	}

	@Override
	public java.lang.String fooRemote() {
		return _fooService.fooRemote();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _fooService.getOSGiServiceIdentifier();
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	@Deprecated
	public FooService getWrappedFooService() {
		return _fooService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	@Deprecated
	public void setWrappedFooService(FooService fooService) {
		_fooService = fooService;
	}

	@Override
	public FooService getWrappedService() {
		return _fooService;
	}

	@Override
	public void setWrappedService(FooService fooService) {
		_fooService = fooService;
	}

	private FooService _fooService;
}