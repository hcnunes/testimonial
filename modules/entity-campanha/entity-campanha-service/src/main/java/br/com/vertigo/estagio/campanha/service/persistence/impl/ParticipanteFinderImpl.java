package br.com.vertigo.estagio.campanha.service.persistence.impl;

import com.liferay.portal.dao.orm.custom.sql.CustomSQL;
import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.exception.SystemException;

import java.util.List;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import br.com.vertigo.estagio.campanha.model.Participante;
import br.com.vertigo.estagio.campanha.service.persistence.ParticipanteFinder;

@Component(service = ParticipanteFinder.class)
public class ParticipanteFinderImpl extends ParticipanteFinderBaseImpl implements ParticipanteFinder {

	@Reference
	private CustomSQL _customSQL;
	
	public long findNotSortedByPromocaoId(long promocaoId) {
			  
				Session session = null;
				
			    try {
			    	
			    	session = openSession();

			        String sql = _customSQL.get(
			            getClass(), "findNotSortedByPromocaoId");

			        SQLQuery q = session.createSQLQuery(sql);
			        q.setCacheable(false);

			        QueryPos qPos = QueryPos.getInstance(q);
			        qPos.add(promocaoId);
			        
			        long userIdPremiado = Long.parseLong(q.uniqueResult().toString());

			        return userIdPremiado;
			    }
			    catch (Exception e) {
			        try {
			            throw new SystemException(e);
			        }
			        catch (SystemException se) {
			            se.printStackTrace();
			        }
			    }
			    finally {
			        closeSession(session);
			    }

			    return 0l;
			}
	
	
	public long findParticipanteIfSortedByPromocaoIduserIdPremiado(long promocaoId, long participanteId) {
		  
		Session session = null;
		
	    try {
	    	
	    	session = openSession();

	        String sql = _customSQL.get(
	            getClass(), "findParticipanteIfSortedByPromocaoIduserIdPremiado");

	        SQLQuery q = session.createSQLQuery(sql);
	        q.setCacheable(false);

	        QueryPos qPos = QueryPos.getInstance(q);
	        qPos.add(promocaoId);
	        qPos.add(participanteId);
	        
	        return Long.parseLong(q.uniqueResult().toString());
	    }
	    catch (Exception e) {
	        try {
	            throw new SystemException(e);
	        }
	        catch (SystemException se) {
	            se.printStackTrace();
	        }
	    }
	    finally {
	        closeSession(session);
	    }

	    return 3l;
	}
	
	public boolean findPromocaoFinalizada(long promocaoId) {
		  
		Session session = null;
		
	    try {
	    	
	    	session = openSession();

	        String sql = _customSQL.get(
	            getClass(), "findPromocaoFinalizada");

	        SQLQuery q = session.createSQLQuery(sql);
	        q.setCacheable(false);

	        QueryPos qPos = QueryPos.getInstance(q);
	        qPos.add(promocaoId);
	        
	        if(Long.parseLong(q.uniqueResult().toString()) == 1) {
	        	return false;
	        } else if (Long.parseLong(q.uniqueResult().toString()) == 0) {
	        	return true;
	        }
	        
	    }
	    catch (Exception e) {
	        try {
	            throw new SystemException(e);
	        }
	        catch (SystemException se) {
	            se.printStackTrace();
	        }
	    }
	    finally {
	        closeSession(session);
	    }

	    return false;
	}
		    
	
}
