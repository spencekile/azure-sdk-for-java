// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.ai.formrecognizer.models;

import com.azure.core.util.ExpandableStringEnum;

import java.util.Collection;

/** Defines values for StringIndexType. */
public final class StringIndexType extends ExpandableStringEnum<StringIndexType> {
    /** Static value textElements for StringIndexType. */
    public static final StringIndexType TEXT_ELEMENTS = fromString("textElements");

    /** Static value unicodeCodePoint for StringIndexType. */
    public static final StringIndexType UNICODE_CODE_POINT = fromString("unicodeCodePoint");

    /** Static value utf16CodeUnit for StringIndexType. */
    public static final StringIndexType UTF16CODE_UNIT = fromString("utf16CodeUnit");

    /**
     * Creates or finds a StringIndexType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding StringIndexType.
     */
    public static StringIndexType fromString(String name) {
        return fromString(name, StringIndexType.class);
    }

    /** @return known StringIndexType values. */
    public static Collection<StringIndexType> values() {
        return values(StringIndexType.class);
    }
}