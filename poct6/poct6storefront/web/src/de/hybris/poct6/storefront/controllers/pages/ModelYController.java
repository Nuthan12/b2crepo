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
 * @author Shruthi.D
 *
 */
@Controller
@RequestMapping("/modelY")
public class ModelYController extends AbstractPageController
{
	private static final String MODELY_CMS_PAGE = "modelYCMSPage";
	@RequestMapping(method = RequestMethod.GET)
	private String getTesla(final Model model) throws CMSItemNotFoundException{
		final ContentPageModel teslaCMSPage = getContentPageForLabelOrId(MODELY_CMS_PAGE);
		storeCmsPageInModel(model, teslaCMSPage);
		setUpMetaDataForContentPage(model, teslaCMSPage);
		return getViewForPage(model);
	}
	}

