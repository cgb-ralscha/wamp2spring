/**
 * Copyright 2017-2017 Ralph Schaer <ralphschaer@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ch.rasc.wamp2spring.config;

public enum Feature {
	DEALER("dealer"), BROKER("broker"),
	DEALER_CALLER_IDENTIFICATION("caller_identification"),
	BROKER_SUBSCRIBER_BLACKWHITE_LISTING("subscriber_blackwhite_listing"),
	BROKER_PUBLISHER_EXCLUSION("publisher_exclusion"),
	BROKER_PUBLISHER_IDENTIFICATION("publisher_identification"),
	BROKER_PATTERN_BASED_SUBSCRIPTION("pattern_based_subscription"),
	BROKER_EVENT_RETENTION("event_retention");

	private final String externalValue;

	private Feature(String externalValue) {
		this.externalValue = externalValue;
	}

	public String getExternalValue() {
		return this.externalValue;
	}

}
