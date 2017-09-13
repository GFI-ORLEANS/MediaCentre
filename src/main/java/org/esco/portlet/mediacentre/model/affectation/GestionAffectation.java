/**
 * Copyright © 2017 GIP-RECIA (https://www.recia.fr/)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.esco.portlet.mediacentre.model.affectation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GestionAffectation {

	private final Logger log = LoggerFactory.getLogger(this.getClass());

	/* 
	 * ===============================================
	 * Propriétés de la classe 
	 * =============================================== 
	 */

	private String id;
	
	private String nom;
	
	private String description;
	
	private String lien;
	
	private String population;
	
	private String regexpPopulation;
	
	/* 
	 * ===============================================
	 * Constructeurs de la classe 
	 * =============================================== 
	 */
	public GestionAffectation() {

	}
	
	/* 
	 * ===============================================
	 * Getter / Setter de la classe 
	 * =============================================== 
	 */

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the lien
	 */
	public String getLien() {
		return lien;
	}

	/**
	 * @param lien the lien to set
	 */
	public void setLien(String lien) {
		this.lien = lien;
	}

	/**
	 * @return the population
	 */
	public String getPopulation() {
		return population;
	}

	/**
	 * @param population the population to set
	 */
	public void setPopulation(String population) {
		this.population = population;
	}

	/**
	 * @return the regexpPopulation
	 */
	public String getRegexpPopulation() {
		return regexpPopulation;
	}

	/**
	 * @param regexpPopulation the regexpPopulation to set
	 */
	public void setRegexpPopulation(String regexpPopulation) {
		this.regexpPopulation = regexpPopulation;
	}

	/**
	 * @return the log
	 */
	public Logger getLog() {
		return log;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "GestionAffectation [log=" + log + ", id=" + id + ", nom=" + nom + ", description=" + description
				+ ", lien=" + lien + ", population=" + population + ", regexpPopulation=" + regexpPopulation + "]";
	}
	
}
