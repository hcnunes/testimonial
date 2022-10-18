<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>

<%@ taglib prefix="aui" uri="http://liferay.com/tld/aui"%>
<%@ taglib prefix="clay" uri="http://liferay.com/tld/clay"%>
<%@ taglib prefix="liferay-item-selector" uri="http://liferay.com/tld/item-selector"%>
<%@ taglib prefix="liferay-frontend" uri="http://liferay.com/tld/frontend"%>
<%@ taglib prefix="liferay-portlet" uri="http://liferay.com/tld/portlet"%>
<%@ taglib prefix="liferay-theme" uri="http://liferay.com/tld/theme"%>
<%@ taglib prefix="liferay-ui" uri="http://liferay.com/tld/ui"%>
<%@ taglib prefix="liferay-security" uri="http://liferay.com/tld/security"%>

<%@ page import="java.util.Date"%>
<%@ page import="javax.portlet.WindowState"%>

<%@ page import="com.liferay.portal.kernel.servlet.SessionErrors"%>
<%@ page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@ page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@ page import="com.liferay.portal.kernel.util.HtmlUtil"%>
<%@ page import="com.liferay.document.library.kernel.service.DLAppServiceUtil"%>
<%@ page import="com.liferay.document.library.kernel.service.DLAppLocalServiceUtil"%>

<%@ page import="com.liferay.testimonial.constants.MVCCommandKeys" %>
<%@ page import="com.liferay.testimonial.constants.TestimonialPortletKeys" %>
<%@ page import="com.liferay.testimonial.model.Testament"%>
<%@ page import="com.liferay.testimonial.model.Contact"%>
<liferay-theme:defineObjects />

<portlet:defineObjects />