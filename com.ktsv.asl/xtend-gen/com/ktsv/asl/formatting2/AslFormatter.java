/**
 * generated by Xtext 2.25.0
 */
package com.ktsv.asl.formatting2;

import com.google.inject.Inject;
import com.ktsv.asl.services.AslGrammarAccess;
import eclipse.emf.abmodel.model.abmodel.ABModel;
import eclipse.emf.abmodel.model.abmodel.AgentBlock;
import eclipse.emf.abmodel.model.abmodel.ExperimentBlock;
import eclipse.emf.abmodel.model.abmodel.GlobalBlock;
import eclipse.emf.abmodel.model.abmodel.GlobalVariable;
import eclipse.emf.abmodel.model.abmodel.SpatialEntity;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class AslFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private AslGrammarAccess _aslGrammarAccess;
  
  protected void _format(final ABModel aBModel, @Extension final IFormattableDocument document) {
    document.<GlobalBlock>format(aBModel.getContainsG());
    EList<AgentBlock> _containsS = aBModel.getContainsS();
    for (final AgentBlock agentBlock : _containsS) {
      document.<AgentBlock>format(agentBlock);
    }
    EList<ExperimentBlock> _containsE = aBModel.getContainsE();
    for (final ExperimentBlock experimentBlock : _containsE) {
      document.<ExperimentBlock>format(experimentBlock);
    }
  }
  
  protected void _format(final GlobalBlock globalBlock, @Extension final IFormattableDocument document) {
    EList<GlobalVariable> _containsGl = globalBlock.getContainsGl();
    for (final GlobalVariable globalVariable : _containsGl) {
      document.<GlobalVariable>format(globalVariable);
    }
    EList<SpatialEntity> _containsSE = globalBlock.getContainsSE();
    for (final SpatialEntity spatialEntity : _containsSE) {
      document.<SpatialEntity>format(spatialEntity);
    }
  }
  
  public void format(final Object aBModel, final IFormattableDocument document) {
    if (aBModel instanceof XtextResource) {
      _format((XtextResource)aBModel, document);
      return;
    } else if (aBModel instanceof ABModel) {
      _format((ABModel)aBModel, document);
      return;
    } else if (aBModel instanceof GlobalBlock) {
      _format((GlobalBlock)aBModel, document);
      return;
    } else if (aBModel instanceof EObject) {
      _format((EObject)aBModel, document);
      return;
    } else if (aBModel == null) {
      _format((Void)null, document);
      return;
    } else if (aBModel != null) {
      _format(aBModel, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(aBModel, document).toString());
    }
  }
}
