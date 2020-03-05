package com.example.adminserver.notifier;

import de.codecentric.boot.admin.server.domain.entities.Instance;
import de.codecentric.boot.admin.server.domain.entities.InstanceRepository;
import de.codecentric.boot.admin.server.domain.events.InstanceEvent;
import de.codecentric.boot.admin.server.notify.AbstractStatusChangeNotifier;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

/**
 * com.example.adminserver.otifier
 *
 * @author caofengnian
 * @Date 2020-03-03
 */
@Slf4j
@Service
public class SmsNotifier extends AbstractStatusChangeNotifier {
	
	public SmsNotifier(InstanceRepository repository) {
		super(repository);
	}
	
	@Override
	protected Mono<Void> doNotify(InstanceEvent event, Instance instance) {
		log.info("event:{}",event);
		return null;
	}
	
	@Override
	protected boolean shouldNotify(InstanceEvent event, Instance instance) {
		return super.shouldNotify(event, instance);
	}
}
