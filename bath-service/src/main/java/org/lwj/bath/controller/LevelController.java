package org.lwj.bath.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import org.lwj.bath.service.LevelService;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lwj
 * @since 2020-11-09
 */
@RestController
@RequestMapping("/level")
public class LevelController {
	@Autowired
	private LevelService levelService;
}
