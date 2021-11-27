package com.adobe.aem.guides.aceit.core.models;

import java.util.List;

/**
 * Represents the Byline component for aceit Site Project.
 */

public interface Byline {
    /***
     * @return a string to display as the name.
     */
    String getName();

    /***
     * Occupations are to be sorted alphabetically in a descending order.
     *
     * @return a list of occupations.
     */
    List<String> getOccupations();

    /***
     * @return a boolean if the component has enough content to display.
     */
    boolean isEmpty();
}
