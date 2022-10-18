package br.com.vertigo.estagio.campanha.exception;

import com.liferay.portal.kernel.exception.PortalException;

import java.util.List;

public class PromocaoValidationException extends PortalException {

	 /**
	  * Custom constructor taking a list as a parameter.
	  * 
	  * @param errors
	  */
	 public PromocaoValidationException(List<String> errors) {

	     super(String.join(",", errors));
	     _errors = errors;
	 }

	 public List<String> getErrors() {

	     return _errors;
	 }

	 private List<String> _errors;
	
	public PromocaoValidationException() {
	}

	public PromocaoValidationException(String msg) {
		super(msg);
	}

	public PromocaoValidationException(String msg, Throwable cause) {
		super(msg, cause);
	}

	public PromocaoValidationException(Throwable cause) {
		super(cause);
	}
	
}
