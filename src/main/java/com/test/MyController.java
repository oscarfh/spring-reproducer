package com.test;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequiredArgsConstructor
public class MyController implements MyApi {

	@Override
	public ResponseEntity<String> myEndpoint(Integer limit) {
		String str = String.format("%s", limit);
		return ResponseEntity.ok(str);
	}
}
