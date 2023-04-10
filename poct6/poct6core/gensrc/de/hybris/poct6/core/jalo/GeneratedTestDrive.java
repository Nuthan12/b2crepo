/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 07-Apr-2023, 6:34:16 pm                     ---
 * ----------------------------------------------------------------
 *  
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.poct6.core.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.poct6.core.constants.Poct6CoreConstants;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.poct6.core.jalo.TestDrive testDriveCustomer}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedTestDrive extends GenericItem
{
	/** Qualifier of the <code>testDriveCustomer.email</code> attribute **/
	public static final String EMAIL = "email";
	/** Qualifier of the <code>testDriveCustomer.firstName</code> attribute **/
	public static final String FIRSTNAME = "firstName";
	/** Qualifier of the <code>testDriveCustomer.lastName</code> attribute **/
	public static final String LASTNAME = "lastName";
	/** Qualifier of the <code>testDriveCustomer.mobileNo</code> attribute **/
	public static final String MOBILENO = "mobileNo";
	/** Qualifier of the <code>testDriveCustomer.modelType</code> attribute **/
	public static final String MODELTYPE = "modelType";
	/** Qualifier of the <code>testDriveCustomer.date</code> attribute **/
	public static final String DATE = "date";
	/** Qualifier of the <code>testDriveCustomer.timeSlot</code> attribute **/
	public static final String TIMESLOT = "timeSlot";
	/** Qualifier of the <code>testDriveCustomer.metroCity</code> attribute **/
	public static final String METROCITY = "metroCity";
	/** Qualifier of the <code>testDriveCustomer.teslaDealer</code> attribute **/
	public static final String TESLADEALER = "teslaDealer";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(EMAIL, AttributeMode.INITIAL);
		tmp.put(FIRSTNAME, AttributeMode.INITIAL);
		tmp.put(LASTNAME, AttributeMode.INITIAL);
		tmp.put(MOBILENO, AttributeMode.INITIAL);
		tmp.put(MODELTYPE, AttributeMode.INITIAL);
		tmp.put(DATE, AttributeMode.INITIAL);
		tmp.put(TIMESLOT, AttributeMode.INITIAL);
		tmp.put(METROCITY, AttributeMode.INITIAL);
		tmp.put(TESLADEALER, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>testDriveCustomer.date</code> attribute.
	 * @return the date - Date
	 */
	public Date getDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, DATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>testDriveCustomer.date</code> attribute.
	 * @return the date - Date
	 */
	public Date getDate()
	{
		return getDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>testDriveCustomer.date</code> attribute. 
	 * @param value the date - Date
	 */
	public void setDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, DATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>testDriveCustomer.date</code> attribute. 
	 * @param value the date - Date
	 */
	public void setDate(final Date value)
	{
		setDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>testDriveCustomer.email</code> attribute.
	 * @return the email - Email Address
	 */
	public String getEmail(final SessionContext ctx)
	{
		return (String)getProperty( ctx, EMAIL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>testDriveCustomer.email</code> attribute.
	 * @return the email - Email Address
	 */
	public String getEmail()
	{
		return getEmail( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>testDriveCustomer.email</code> attribute. 
	 * @param value the email - Email Address
	 */
	public void setEmail(final SessionContext ctx, final String value)
	{
		setProperty(ctx, EMAIL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>testDriveCustomer.email</code> attribute. 
	 * @param value the email - Email Address
	 */
	public void setEmail(final String value)
	{
		setEmail( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>testDriveCustomer.firstName</code> attribute.
	 * @return the firstName - First Name
	 */
	public String getFirstName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, FIRSTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>testDriveCustomer.firstName</code> attribute.
	 * @return the firstName - First Name
	 */
	public String getFirstName()
	{
		return getFirstName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>testDriveCustomer.firstName</code> attribute. 
	 * @param value the firstName - First Name
	 */
	public void setFirstName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, FIRSTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>testDriveCustomer.firstName</code> attribute. 
	 * @param value the firstName - First Name
	 */
	public void setFirstName(final String value)
	{
		setFirstName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>testDriveCustomer.lastName</code> attribute.
	 * @return the lastName - Last Name
	 */
	public String getLastName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, LASTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>testDriveCustomer.lastName</code> attribute.
	 * @return the lastName - Last Name
	 */
	public String getLastName()
	{
		return getLastName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>testDriveCustomer.lastName</code> attribute. 
	 * @param value the lastName - Last Name
	 */
	public void setLastName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, LASTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>testDriveCustomer.lastName</code> attribute. 
	 * @param value the lastName - Last Name
	 */
	public void setLastName(final String value)
	{
		setLastName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>testDriveCustomer.metroCity</code> attribute.
	 * @return the metroCity - City
	 */
	public String getMetroCity(final SessionContext ctx)
	{
		return (String)getProperty( ctx, METROCITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>testDriveCustomer.metroCity</code> attribute.
	 * @return the metroCity - City
	 */
	public String getMetroCity()
	{
		return getMetroCity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>testDriveCustomer.metroCity</code> attribute. 
	 * @param value the metroCity - City
	 */
	public void setMetroCity(final SessionContext ctx, final String value)
	{
		setProperty(ctx, METROCITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>testDriveCustomer.metroCity</code> attribute. 
	 * @param value the metroCity - City
	 */
	public void setMetroCity(final String value)
	{
		setMetroCity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>testDriveCustomer.mobileNo</code> attribute.
	 * @return the mobileNo - Mobile Number
	 */
	public String getMobileNo(final SessionContext ctx)
	{
		return (String)getProperty( ctx, MOBILENO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>testDriveCustomer.mobileNo</code> attribute.
	 * @return the mobileNo - Mobile Number
	 */
	public String getMobileNo()
	{
		return getMobileNo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>testDriveCustomer.mobileNo</code> attribute. 
	 * @param value the mobileNo - Mobile Number
	 */
	public void setMobileNo(final SessionContext ctx, final String value)
	{
		setProperty(ctx, MOBILENO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>testDriveCustomer.mobileNo</code> attribute. 
	 * @param value the mobileNo - Mobile Number
	 */
	public void setMobileNo(final String value)
	{
		setMobileNo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>testDriveCustomer.modelType</code> attribute.
	 * @return the modelType - Model Type
	 */
	public String getModelType(final SessionContext ctx)
	{
		return (String)getProperty( ctx, MODELTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>testDriveCustomer.modelType</code> attribute.
	 * @return the modelType - Model Type
	 */
	public String getModelType()
	{
		return getModelType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>testDriveCustomer.modelType</code> attribute. 
	 * @param value the modelType - Model Type
	 */
	public void setModelType(final SessionContext ctx, final String value)
	{
		setProperty(ctx, MODELTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>testDriveCustomer.modelType</code> attribute. 
	 * @param value the modelType - Model Type
	 */
	public void setModelType(final String value)
	{
		setModelType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>testDriveCustomer.teslaDealer</code> attribute.
	 * @return the teslaDealer - Dealer
	 */
	public String getTeslaDealer(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TESLADEALER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>testDriveCustomer.teslaDealer</code> attribute.
	 * @return the teslaDealer - Dealer
	 */
	public String getTeslaDealer()
	{
		return getTeslaDealer( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>testDriveCustomer.teslaDealer</code> attribute. 
	 * @param value the teslaDealer - Dealer
	 */
	public void setTeslaDealer(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TESLADEALER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>testDriveCustomer.teslaDealer</code> attribute. 
	 * @param value the teslaDealer - Dealer
	 */
	public void setTeslaDealer(final String value)
	{
		setTeslaDealer( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>testDriveCustomer.timeSlot</code> attribute.
	 * @return the timeSlot - Time Slot
	 */
	public String getTimeSlot(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TIMESLOT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>testDriveCustomer.timeSlot</code> attribute.
	 * @return the timeSlot - Time Slot
	 */
	public String getTimeSlot()
	{
		return getTimeSlot( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>testDriveCustomer.timeSlot</code> attribute. 
	 * @param value the timeSlot - Time Slot
	 */
	public void setTimeSlot(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TIMESLOT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>testDriveCustomer.timeSlot</code> attribute. 
	 * @param value the timeSlot - Time Slot
	 */
	public void setTimeSlot(final String value)
	{
		setTimeSlot( getSession().getSessionContext(), value );
	}
	
}
