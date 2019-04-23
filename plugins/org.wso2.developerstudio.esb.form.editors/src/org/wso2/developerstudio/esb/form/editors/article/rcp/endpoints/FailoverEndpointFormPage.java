package org.wso2.developerstudio.esb.form.editors.article.rcp.endpoints;

import java.util.List;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.widgets.Section;
import org.wso2.developerstudio.eclipse.gmf.esb.EndPointProperty;
import org.wso2.developerstudio.esb.form.editors.article.providers.ConfigureEndPointPropertiesDialog;
import org.wso2.developerstudio.esb.form.editors.article.rcp.Messages;

public class FailoverEndpointFormPage extends EndpointFormPage {
    protected Text loadBalanceEP_URI;

    protected Button loadbalanceEP_Properties;

    public List<EndPointProperty> endpointPropertyList;
    Section basicSection;
    Section miscSection;

    public FailoverEndpointFormPage(FormEditor editor) {
        super(editor);
        this.isTemplate = isTemplate;
    }

    public Text getAddressEP_URI() {
        return loadBalanceEP_URI;
    }

    public void setAddressEP_URI(Text addressEP_URI) {
        this.loadBalanceEP_URI = addressEP_URI;
    }

    public Button getAddressEP_Properties() {
        return loadbalanceEP_Properties;
    }

    public void setAddressEP_Properties(Button addressEP_Properties) {
        this.loadbalanceEP_Properties = addressEP_Properties;
    }

    protected void createFormContent(IManagedForm managedForm) {

        super.createFormContent(managedForm);
        form.setText(Messages.getString("FailoverEndpointPage.sectionMainTitle"));
    }
    

    public void createFormMiscSection() {

        /* Misc Section */
        miscSection = endpointCommons.createSection(form, toolkit, Messages.getString("EndpointPage.section.misc"));
       
        GridData miscSectionGridData = new GridData();
        miscSectionGridData.horizontalSpan = 3;
        miscSectionGridData.horizontalAlignment = GridData.FILL;
        miscSectionGridData.grabExcessHorizontalSpace = true;
        miscSection.setLayoutData(miscSectionGridData);
        // miscSection.setLayoutData(new TableWrapData(TableWrapData.FILL));

        Composite miscSectionClient = toolkit.createComposite(miscSection);
        miscSectionClient.setLayout(new GridLayout());
        miscSection.setClient(miscSectionClient);   
            
        toolkit.createLabel(miscSectionClient, "URI :");
        loadBalanceEP_URI = toolkit.createText(miscSectionClient, "");
        loadBalanceEP_URI.setBackground(new Color(null, 229,236,253));
        //addressEP_URI.setLayoutData(new TableWrapData(TableWrapData.FILL_GRAB));
        GridData addressEPUriGridData = new GridData();
        addressEPUriGridData.horizontalSpan = 3;
        addressEPUriGridData.horizontalAlignment = GridData.FILL;
        addressEPUriGridData.grabExcessHorizontalSpace = true;
        loadBalanceEP_URI.setLayoutData(addressEPUriGridData);
        
        loadBalanceEP_URI.addModifyListener(new ModifyListener() {
            @Override
            public void modifyText(ModifyEvent e) {
                setSave(true);
                updateDirtyState();
            }
        });

        toolkit.createLabel(miscSectionClient, "Optimize :");
        eP_Optimize = new Combo(miscSectionClient, SWT.DROP_DOWN);
        //addressEP_Optimize.setLayoutData(new TableWrapData(TableWrapData.FILL_GRAB));
        String[] formats = {"LEAVE_AS_IS", "MTOM", "SWA"};
        eP_Optimize.setItems(formats);
        GridData addressEPOptimizeGridData = new GridData();
        addressEPOptimizeGridData.horizontalSpan = 3;
        addressEPOptimizeGridData.horizontalAlignment = GridData.FILL;
        addressEPOptimizeGridData.grabExcessHorizontalSpace = true;
        eP_Optimize.setLayoutData(addressEPOptimizeGridData);
        
        eP_Optimize.addSelectionListener(new SelectionAdapter() {
            public void widgetSelected(SelectionEvent e) {
                setSave(true);
                updateDirtyState();
            }
        });
        
        toolkit.createLabel(miscSectionClient, "Description :");
        eP_Description = toolkit.createText(miscSectionClient, "");
        eP_Description.setBackground(new Color(null, 229,236,253));
        //addressEP_Description.setLayoutData(new TableWrapData(TableWrapData.FILL_GRAB));
        GridData addressEPDescriptionGridData = new GridData();
        addressEPDescriptionGridData.horizontalSpan = 3;
        addressEPDescriptionGridData.horizontalAlignment = GridData.FILL;
        addressEPDescriptionGridData.grabExcessHorizontalSpace = true;
        eP_Description.setLayoutData(addressEPDescriptionGridData);
        
        eP_Description.addModifyListener(new ModifyListener() {
            @Override
            public void modifyText(ModifyEvent e) {
                setSave(true);
                updateDirtyState();
            }
        });
        
        toolkit.createLabel(miscSectionClient, "Properties :");
        /*eP_Properties = toolkit.createText(miscSectionClient, "");
        eP_Properties.setBackground(new Color(null, 229,236,253));
        //eP_Properties.setLayoutData(new TableWrapData(TableWrapData.FILL_GRAB));
        GridData epPropertiesGridData = new GridData();
        epPropertiesGridData.horizontalSpan = 3;
        epPropertiesGridData.horizontalAlignment = GridData.FILL;
        epPropertiesGridData.grabExcessHorizontalSpace = true;
        eP_Properties.setLayoutData(epPropertiesGridData);*/
        
        loadbalanceEP_Properties = toolkit.createButton(miscSectionClient, "Add Properties", SWT.PUSH);
        loadbalanceEP_Properties.setBackground(new Color(null, 229, 236, 253));
        loadbalanceEP_Properties.addSelectionListener(new SelectionListener() {

            @Override
            public void widgetSelected(SelectionEvent e) {
                Shell shell = Display.getDefault().getActiveShell();
                ConfigureEndPointPropertiesDialog paramDialog = new ConfigureEndPointPropertiesDialog(shell,
                        endpointPropertyList);
                paramDialog.setBlockOnOpen(true);
                paramDialog.open();
                endpointPropertyList = paramDialog.getEndpointPropertyList();
                
                setSave(true);
                updateDirtyState();
            }

            @Override
            public void widgetDefaultSelected(SelectionEvent e) {
                // TODO Auto-generated method stub

            }
        });

    }
    
    public void createFormQosSection() {
        endpointCommons.createFormQosSection(form, toolkit);
    }

    public void createFormErrorHandlingSection() {
        endpointCommons.createFormErrorHandlingSection(form, toolkit);
    }

}
