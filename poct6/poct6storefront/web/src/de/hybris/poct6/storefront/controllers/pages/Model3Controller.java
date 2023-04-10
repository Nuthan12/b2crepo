/**
 *
 */
package de.hybris.poct6.storefront.controllers.pages;

/**
 * @author Archith.RA
 *
 */
import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractPageController;
import de.hybris.platform.cms2.exceptions.CMSItemNotFoundException;
import de.hybris.platform.cms2.model.pages.ContentPageModel;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/model3")
public class Model3Controller extends AbstractPageController
{
	private static final String MODEL3_CMS_PAGE = "model3CMSPage";

  @RequestMapping(method = RequestMethod.GET)
  private String getTesla(final Model model) throws CMSItemNotFoundException
   {
		final ContentPageModel teslaCMSPage = getContentPageForLabelOrId(MODEL3_CMS_PAGE);
    storeCmsPageInModel(model, teslaCMSPage);
    setUpMetaDataForContentPage(model, teslaCMSPage);
    return getViewForPage(model);
 }

}