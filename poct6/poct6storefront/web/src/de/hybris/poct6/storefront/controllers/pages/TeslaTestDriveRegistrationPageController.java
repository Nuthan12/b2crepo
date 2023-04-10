/**
 *
 */
package de.hybris.poct6.storefront.controllers.pages;

import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractPageController;
import de.hybris.platform.cms2.exceptions.CMSItemNotFoundException;
import de.hybris.platform.cms2.model.pages.ContentPageModel;
import de.hybris.poct6.storefront.forms.TeslaTestDriveRegistrationForm;
import de.hybris.poct6.storefront.service.TeslaTestDriveRegistrationService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
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

	@Autowired
	private TeslaTestDriveRegistrationService teslaTestDriveRegistrationService;


	@RequestMapping(method = RequestMethod.GET)
	private String getTesla(final Model model) throws CMSItemNotFoundException
	{
		final ContentPageModel testDriveRegistrationCMSPage = getContentPageForLabelOrId(TEST_DRIVE_REGISTRATION_CMS_PAGE);
		storeCmsPageInModel(model, testDriveRegistrationCMSPage);
		setUpMetaDataForContentPage(model, testDriveRegistrationCMSPage);
		return getViewForPage(model);
	}



   // Render the registration form
	/*
	 * @GetMapping
	 *
	 * @RequestMapping(method = RequestMethod.GET) public String showRegistrationForm(final Model model) throws
	 * CMSItemNotFoundException { model.addAttribute("teslaRegistrationPage", new TeslaTestDriveRegistrationForm()); return
	 * "tesla/teslaRegistartionPage"; }
	 */

   // Handle form submission
   @PostMapping
	@RequestMapping(method = RequestMethod.POST)
	public String submitRegistrationForm(
			@ModelAttribute("teslaRegistrationPage") @Valid final TeslaTestDriveRegistrationForm form,
                                        final BindingResult bindingResult, final Model model, final HttpServletRequest request,
                                        final HttpServletResponse response) throws CMSItemNotFoundException
   {
       // Perform form validation
       if (bindingResult.hasErrors())
       {
			 model.addAttribute("teslaRegistationPage", form);
			 return "tesla/teslaRegistrationPage";
       }



       // Redirect to success page or show success message
		 model.addAttribute("successMessage", "Test Drive Booked Successfully!");
		 return "tesla/teslaRegistrationPage";
   }

	@RequestMapping(value = "/tesla/teslaRegistrationPage", method = RequestMethod.POST)
	public String handleRegistrationFormSubmit(
			@ModelAttribute("teslaTestDriveRegistrationForm") final TeslaTestDriveRegistrationForm teslaRegistrationForm,
			final Model model)
	{
		// Process form data and save to database
		// ...
		return "/tesla/teslaRegistationPage"; // Return the view name for the success page
	}



}
