package org.openmrs.module.kenyatheater.api.service;

import org.openmrs.annotation.Authorized;
import org.openmrs.api.OpenmrsService;
import org.openmrs.module.kenyatheater.api.model.SurgicalAppointmentAttributeType;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface SurgicalAppointmentAttributeTypeService extends OpenmrsService {
	
	@Authorized({ "View OT Schedules" })
	List<SurgicalAppointmentAttributeType> getAllAttributeTypes();
	
	@Authorized({ "View OT Schedules" })
	SurgicalAppointmentAttributeType getSurgicalAppointmentAttributeTypeByUuid(String uuid);
}
