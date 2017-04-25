package coupons.web;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;

@ApplicationPath("/jaxrs")
public class CouponsApplication extends javax.ws.rs.core.Application {
//	@ApplicationPath("/jaxrs")
	@Override
	public Set<Object> getSingletons() {
	HashSet<Object> singletons = new HashSet<>();
	// replace this line with lines adding your own resources objects
	singletons.add(new DemoResource());
	return singletons;
	}
}
