/**
 * Copyright 2000-present Liferay, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package blade.portlet;

import com.liferay.portal.jsf.portlet.tracker.JSFPortlet;
import org.osgi.framework.BundleContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;

import javax.portlet.GenericPortlet;
import javax.portlet.Portlet;

@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=Listener Servlet Portlet DS",
		"javax.portlet.init-param.view-template=",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = JSFPortlet.class
)
public class ListenerServletPortletDS extends GenericPortlet implements JSFPortlet {

	@Activate
	public void activate(BundleContext bundleContext) {
		System.err.println("!@#$ activated " + this);
	}
}