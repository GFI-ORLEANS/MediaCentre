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

import java.io.Serializable;
import java.util.List;

public class CategorieFiltreModel implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -979373924543584085L;

	private List<CategorieFiltres> listCategorieFiltre;
	
	
	public CategorieFiltreModel() {
	}


	/**
	 * @return the listCategorieFiltre
	 */
	public List<CategorieFiltres> getListCategorieFiltre() {
		return listCategorieFiltre;
	}


	/**
	 * @param listCategorieFiltre the listCategorieFiltre to set
	 */
	public void setListCategorieFiltre(List<CategorieFiltres> listCategorieFiltre) {
		this.listCategorieFiltre = listCategorieFiltre;
	}
}
