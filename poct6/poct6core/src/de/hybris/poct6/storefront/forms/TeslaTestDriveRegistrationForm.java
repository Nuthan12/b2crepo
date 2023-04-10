/**
 *
 */
package de.hybris.poct6.storefront.forms;

import java.util.Date;


/**
 * @author nuthan.sml
 *
 */
public class TeslaTestDriveRegistrationForm
{
	private String email;
	    private String firstName;
	    private String lastName;
	    private String mobileNo;
	    private String modelType;
	    private Date date;
	    private String timeSlot;
	    private String metroCity;
	    private String teslaDealer;

	    // Define getters and setters for the form fields
	    public String getEmail()
	    {
	        return email;
	    }

	    public void setEmail(final String email)
	    {
	        this.email = email;
	    }

	    public String getFirstName()
	    {
	        return firstName;
	    }

	    public void setFirstName(final String firstName)
	    {
	        this.firstName = firstName;
	    }

	    public String getLastName()
	    {
	        return lastName;
	    }

	    public void setLastName(final String lastName)
	    {
	        this.lastName = lastName;
	    }

	    public String getMobileNo()
	    {
	        return mobileNo;
	    }

	    public void setMobileNo(final String mobileNo)
	    {
	        this.mobileNo = mobileNo;
	    }

	    public String getModelType()
	    {
	        return modelType;
	    }

	    public void setModelType(final String modelType)
	    {
	        this.modelType = modelType;
	    }

	    public Date getDate()
	    {
	        return date;
	    }

	    public void setDate(final Date date)
	    {
	        this.date = date;
	    }

	    public String getTimeSlot()
	    {
	        return timeSlot;
	    }

	    public void setTimeSlot(final String timeSlot)
	    {
	        this.timeSlot = timeSlot;
	    }

	    public String getMetroCity()
	    {
	        return metroCity;
	    }

	    public void setMetroCity(final String metroCity)
	    {
	        this.metroCity = metroCity;
	    }

	    public String getTeslaDealer()
	    {
	        return teslaDealer;
	    }

	    public void setTeslaDealer(final String teslaDealer)
	    {
	        this.teslaDealer = teslaDealer;
	    }

}

