/**
 * 
 */
package fr.adaming.managedBeans;

import java.io.Serializable;
import java.util.Locale;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;

/**
 * @author inti0302
 *
 */
@ManagedBean(name = "user")
@SessionScoped
public class UserBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String country = Locale.FRANCE.getCountry();
	private static final Locale[] countries = {Locale.US, Locale.CANADA,Locale.FRANCE};

	/**
	 * 
	 */
	public UserBean() {
		super();
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country
	 *            the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the countries
	 */
	public Locale[] getCountries() {
		return countries;
	}


	public void countryChanged(ValueChangeEvent event) {
		for (Locale locale : countries) {
			if (locale.getCountry().equals(event.getNewValue())) {
				FacesContext.getCurrentInstance().getViewRoot()
						.setLocale(locale);
			}
		}
	}

}
