package com.qa.persistence.repository;

import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import com.qa.persistence.domain.Account;
import com.qa.util.JSONUtil;

import java.util.Collection;
import java.util.*;

import static javax.transaction.Transactional.TxType.REQUIRED;
import static javax.transaction.Transactional.TxType.SUPPORTS;

@Default
@Transactional(SUPPORTS)
public class ClassroomDBRepository {

	@Inject
	private JSONUtil util;
	@PersistenceContext(unitName = "primary")
	private EntityManager em;

}
