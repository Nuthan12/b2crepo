<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/template"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags" %>

<template:page pageTitle="${pageTitle}">
		<cms:pageSlot position="teslaParagraph" var="feature" class="teslaBannerParagraph">
			<cms:component component="${feature}" />
		</cms:pageSlot>
		

</template:page>	
  