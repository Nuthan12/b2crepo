/**
 *
 */
package de.hybris.poct6.storefront.service;

import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.user.UserService;
import de.hybris.poct6.storefront.forms.TeslaTestDriveRegistrationForm;
import de.hybris.poct6.storefront.model.TeslaTestDriveModel;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;


/**
 * @author nuthan.sml
 *
 */

@Service
public class TeslaTestDriveRegistrationService
{
	@Resource
	private UserService userService;

	@Resource
	private ModelService modelService;

	public void registrationTestDrive(final TeslaTestDriveRegistrationForm teslaTestDriveRegistrationForm)
	{
		final TeslaTestDriveModel testDriveModel = new TeslaTestDriveModel();
		testDriveModel.setEmail(teslaTestDriveRegistrationForm.getEmail());
		testDriveModel.setFirstName(teslaTestDriveRegistrationForm.getFirstName());
		testDriveModel.setLastName(teslaTestDriveRegistrationForm.getLastName());
		testDriveModel.setMobileNo(teslaTestDriveRegistrationForm.getMobileNo());
		testDriveModel.setModelType(teslaTestDriveRegistrationForm.getModelType());
		testDriveModel.setDate(teslaTestDriveRegistrationForm.getDate());
		testDriveModel.setTimeSlot(teslaTestDriveRegistrationForm.getTimeSlot());
		testDriveModel.setMetroCity(teslaTestDriveRegistrationForm.getMetroCity());
		testDriveModel.setTeslaDealer(teslaTestDriveRegistrationForm.getTeslaDealer());

		// Save the testDriveModel to the database
		modelService.save(testDriveModel);

	}
}
