package com.hogan.budget.web.handler;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hogan.budget.web.service.SyncService;

/**
 * 
 * @author Hogan
 * @description
 * @date Aug 6, 2016 5:29:02 PM
 */
@Controller
@RequestMapping("/sync")
public class SyncDataHandler {

	@Resource
	private SyncService syncService;

	public void syncData() {
		
	}
}
