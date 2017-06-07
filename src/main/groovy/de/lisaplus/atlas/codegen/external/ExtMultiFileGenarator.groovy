package de.lisaplus.atlas.codegen.external

import de.lisaplus.atlas.codegen.GeneratorBase
import de.lisaplus.atlas.codegen.MultiFileGenarator
import de.lisaplus.atlas.codegen.TemplateType
import de.lisaplus.atlas.interf.ICodeGen
import de.lisaplus.atlas.interf.IExternalCodeGen
import de.lisaplus.atlas.model.Model
import org.slf4j.Logger
import org.slf4j.LoggerFactory

/**
 * Base class for generators that creates more than one file ... for instance JavaBeanGenerator
 * Created by eiko on 05.06.17.
 */
class ExtMultiFileGenarator extends MultiFileGenarator implements IExternalCodeGen {
    @Override
    void initTemplateFromFile(String templateFile, TemplateType templateType) {
        // TODO
    }

    @Override
    void initTemplateFromResource(String templateResource, TemplateType templateType) {
        // TODO
    }

    Logger getLogger() {
        return l
    }
    private static final Logger l=LoggerFactory.getLogger(ExtMultiFileGenarator.class)
}
