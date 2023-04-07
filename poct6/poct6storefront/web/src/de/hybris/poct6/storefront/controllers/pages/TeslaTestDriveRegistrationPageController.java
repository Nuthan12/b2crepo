/**
 *
 */
package de.hybris.poct6.storefront.controllers.pages;

import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractPageController;
import de.hybris.platform.cms2.exceptions.CMSItemNotFoundException;
import de.hybris.platform.cms2.model.pages.ContentPageModel;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * @author nuthan.sml
 *
 */

@Controller
@RequestMapping(value = "/testDriveRegistration")
public class TeslaTestDriveRegistrationPageController extends AbstractPageController
{
	private static final String TEST_DRIVE_REGISTRATION_CMS_PAGE = "testDriveRegistrationCMSPage";

	@RequestMapping(method = RequestMethod.GET)
	private String getTesla(final Model model) throws CMSItemNotFoundException
	{
		final ContentPageModel testDriveRegistrationCMSPage = getContentPageForLabelOrId(TEST_DRIVE_REGISTRATION_CMS_PAGE);
		storeCmsPageInModel(model, testDriveRegistrationCMSPage);
		setUpMetaDataForContentPage(model, testDriveRegistrationCMSPage);
		return getViewForPage(model);
	}


}
