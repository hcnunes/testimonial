package br.com.vertigo.estagio.campanha.exception;

import com.liferay.portal.kernel.exception.PortalException;

import java.util.List;

public class ParticipanteValidationException extends PortalException {

	 /**
	  * Custom constructor taking a list as a parameter.
	  * 
	  * @param errors
	  */
	 public ParticipanteValidationException(List<String> errors) {

	     super(String.join(",", errors));
	     _errors = errors;
	 }

	 public List<String> getErrors() {

	     return _errors;
	 }

	 private List<String> _errors;
	
	public ParticipanteValidationException() {
	}

	public ParticipanteValidationException(String msg) {
		super(msg);
	}

	public ParticipanteValidationException(String msg, Throwable cause) {
		super(msg, cause);
	}

	public ParticipanteValidationException(Throwable cause) {
		super(cause);
	}
	
}
