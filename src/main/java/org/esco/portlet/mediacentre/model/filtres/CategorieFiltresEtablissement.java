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
package org.esco.portlet.mediacentre.model.filtres;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.esco.portlet.mediacentre.model.ressource.Ressource;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author elecaude
 *
 */
public class CategorieFiltresEtablissement extends CategorieFiltresCalcules {

	/* 
	 * ===============================================
	 * Propriétés de la classe 
	 * =============================================== 
	 */
    @Value("${userInfo.key.etabIds}")
    private String etabCodesInfoKey;
    
    @Value("${userInfo.key.currentEtabId}")
    private String currentEtabCodeInfoKey;
    
	/* 
	 * ===============================================
	 * Constructeurs de la classe 
	 * =============================================== 
	 */

	/* 
	 * ===============================================
	 * Getter / Setter de la classe 
	 * =============================================== 
	 */

	/* 
	 * ===============================================
	 * Méthodes privées de la classe 
	 * =============================================== 
	 */

	/* 
	 * ===============================================
	 * Méthodes publiques de la classe 
	 * =============================================== 
	 */
	/* (non-Javadoc)
	 * @see org.esco.portlet.mediacentre.model.filtres.CategorieFiltres#isValeursMultiples()
	 */
	@Override
	public boolean isValeursMultiples() {
		return true;
	}

	/* (non-Javadoc)
	 * @see org.esco.portlet.mediacentre.model.filtres.CategorieFiltresCalcules#initialiser(java.util.Map, java.util.List)
	 */
	@Override
	public void initialiser(Map<String, List<String>> userInfoMap, List<Ressource> ressources) {
		
		List<String> etablissements = userInfoMap.get(etabCodesInfoKey);
		List<String> etablissementsCourants = userInfoMap.get(currentEtabCodeInfoKey);
		if (etablissements == null) {
			return;
		}
		String etablissementCourant = "";
		if (etablissementsCourants != null && !etablissementsCourants.isEmpty()) {
			etablissementCourant = etablissementsCourants.get(0);
		}
		
		List<String> etablissementsTries = new ArrayList<String>();
		etablissementsTries.addAll(etablissements);
		Collections.sort(etablissementsTries);
		
		List<Filtre> filtres = new ArrayList<Filtre>();
		
		if (StringUtils.isNotBlank(getLibelleTous())) {
			Filtre filtre = new Filtre();
    		filtre.setId(getId());
    		filtre.setLibelle(getLibelleTous());
    		filtre.setActif(false);
    		filtre.setCaseSelectAll(true);
    		filtres.add(filtre);
		}
		
		for (String etablissement : etablissementsTries) {
	    		Filtre filtre = new Filtre();
	    		filtre.setId(etablissement);
	    		filtre.setLibelle(etablissement);
	    		filtre.setActif(etablissement.equalsIgnoreCase(etablissementCourant));
	    		filtre.setNomAttribut(getNomAttributFiltre());
	    		filtre.setRegexpAttribut(etablissement);
	    		filtres.add(filtre);
	    }
		setFiltres(filtres);
	}
	
}
