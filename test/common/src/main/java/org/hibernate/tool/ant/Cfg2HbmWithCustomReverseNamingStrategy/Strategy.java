package org.hibernate.tool.ant.Cfg2HbmWithCustomReverseNamingStrategy;

import org.hibernate.tool.api.reveng.TableIdentifier;
import org.hibernate.tool.internal.reveng.DefaultReverseEngineeringStrategy;

public class Strategy extends DefaultReverseEngineeringStrategy {

	public String tableToClassName(TableIdentifier tableIdentifier) {		
		return "foo.Bar";		
	}

}
