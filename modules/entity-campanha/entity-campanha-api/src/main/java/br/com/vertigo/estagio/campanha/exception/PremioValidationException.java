package br.com.vertigo.estagio.campanha.exception;

import com.liferay.portal.kernel.exception.PortalException;

import java.util.List;

public class PremioValidationException extends PortalException {

	 /**
	  * Custom constructor taking a list as a parameter.
	  * 
	  * @param errors
	  */
	 public PremioValidationException(List<String> errors) {

	     super(String.join(",", errors));
	     _errors = errors;
	 }

	 public List<String> getErrors() {

	     return _errors;
	 }

	 private List<String> _errors;
	
	public PremioValidationException() {
	}

	public PremioValidationException(String msg) {
		super(msg);
	}

	public PremioValidationException(String msg, Throwable cause) {
		super(msg, cause);
	}

	public PremioValidationException(Throwable cause) {
		super(cause);
	}
	
}

