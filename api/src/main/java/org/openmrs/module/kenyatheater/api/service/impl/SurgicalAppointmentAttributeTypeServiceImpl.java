package org.openmrs.module.kenyatheater.api.service.impl;

import org.openmrs.api.impl.BaseOpenmrsService;
import org.openmrs.module.kenyatheater.api.dao.SurgicalAppointmentAttributeTypeDAO;
import org.openmrs.module.kenyatheater.api.model.SurgicalAppointmentAttributeType;
import org.openmrs.module.kenyatheater.api.service.SurgicalAppointmentAttributeTypeService;

import java.util.List;

public class SurgicalAppointmentAttributeTypeServiceImpl extends BaseOpenmrsService implements SurgicalAppointmentAttributeTypeService {
	
	SurgicalAppointmentAttributeTypeDAO surgicalAppointmentAttributeTypeDAO;
	
	public void setSurgicalAppointmentAttributeTypeDAO(
	        SurgicalAppointmentAttributeTypeDAO surgicalAppointmentAttributeTypeDAO) {
		this.surgicalAppointmentAttributeTypeDAO = surgicalAppointmentAttributeTypeDAO;
	}
	
	@Override
	public List<SurgicalAppointmentAttributeType> getAllAttributeTypes() {
		return surgicalAppointmentAttributeTypeDAO.getAllAttributeTypes();
	}
	
	@Override
	public SurgicalAppointmentAttributeType getSurgicalAppointmentAttributeTypeByUuid(String uuid) {
		return surgicalAppointmentAttributeTypeDAO.getSurgicalAppointmentAttributeTypeByUuid(uuid);
	}
}
