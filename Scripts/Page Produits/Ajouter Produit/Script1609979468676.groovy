import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable


'Open the browser and navigate to the demo site'
WebUI.openBrowser('')

'maximize the current browser window'
WebUI.maximizeWindow()

'delete the coockies before loading the website'
WebUI.deleteAllCookies()

'Navigate to the website URL'
WebUI.navigateToUrl('http://proservicestest.com/dev/')

'wait for the current page load for 5sec and checking page loading time'
WebUI.waitForPageLoad(5)

'click on the SHOP menu'
WebUI.click(findTestObject('Object Repository/Produits/Menu SHOP'))

'click on the Products Sub-menu'
WebUI.click(findTestObject('Object Repository/Produits/Menu Produits'))

'wait for the current page load for 5sec and checking page loading time'
WebUI.waitForPageLoad(5)

'Check promoted Product category label'
WebUI.verifyElementText(findTestObject('Produits/Categorie Produit Promotion'), 'BACKPACKS')

'Check promoted Product name label'
WebUI.verifyElementText(findTestObject('Object Repository/Produits/Nom Produit en Promotion'), 'Armz backpack')

'Check promoted Product old price label'
WebUI.verifyElementText(findTestObject('Object Repository/Produits/Prix Produit ancien Promo'), '€35.00')

'Check promoted Product price label'
WebUI.verifyElementText(findTestObject('Object Repository/Produits/Prix Produit en Promo'), '€28.00')

'Check add product button label'
WebUI.verifyElementText(findTestObject('Produits/Ajouter au Panier Button'), 'Ajouter au panier')

'Check Promotion displayed icon'
WebUI.verifyElementText(findTestObject('Object Repository/Produits/Promotion Icon'), 'PROMO !')

'Check Out of Store Product category label'
WebUI.verifyElementText(findTestObject('Object Repository/Produits/Categorie Produit Hors Stock'), 'OFFICESHOES')

'Check Out of Store Product name label'
WebUI.verifyElementText(findTestObject('Object Repository/Produits/Nom Produit Hors Stock'), 'Casual shoes')

'Check Out of Store Product price label'
WebUI.verifyElementText(findTestObject('Object Repository/Produits/Prix Produit Hors Stock'), '€49.00')

'Check "Lire La suite" button label'
WebUI.verifyElementText(findTestObject('Object Repository/Produits/Lire la suite Button'), 'Lire la suite')

'Check Standard Product category label'
WebUI.verifyElementText(findTestObject('Object Repository/Produits/Categorie Produit Standard'), 'CHAIRSFURNITURE')

'Check Standard Product name label'
WebUI.verifyElementText(findTestObject('Object Repository/Produits/Nom Produit Standard'), 'Conference chair')

'Check Standard Product price label'
WebUI.verifyElementText(findTestObject('Object Repository/Produits/Prix Produit Standard'), '€69.00')

'Check Standard Product "Ajouter au panier" Button'
WebUI.verifyElementText(findTestObject('Produits/Ajouter au Panier Button'), 'Ajouter au panier')

'Check if the Product Image is clickable'
WebUI.click(findTestObject('Object Repository/Produits/Click Image Produit'))

'Back to the previous page'
WebUI.back()

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Object Repository/Produits/Categorie Produit Standard'))

'Back to previous page'
WebUI.back()

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Object Repository/Produits/Nom Produit Standard'))

'Back to the previous page'
WebUI.back()

WebUI.waitForPageLoad(5)

'Check if the Button "Ajouter au Panier" is clickable'
WebUI.click(findTestObject('Object Repository/Produits/Ajouter au Panier Button'))

'Check if the Button "Lire la suite" is clickable'
WebUI.click(findTestObject('Object Repository/Produits/Lire la suite Button'))

WebUI.waitForPageLoad(5)

WebUI.back()

WebUI.waitForPageLoad(5)

'click for the second time on "Ajouter au Panier" Button'
WebUI.click(findTestObject('Object Repository/Produits/Ajouter au Panier Button'))

'check if 2  products were counted'
WebUI.verifyElementText(findTestObject('Object Repository/Produits/2 ordered products'), '2')

'click on Shop Icon'
WebUI.click(findTestObject('Object Repository/SHOP Icon/SHOP Icon'))

'Check Ordered Product name Label'
WebUI.verifyElementText(findTestObject('Object Repository/SHOP Icon/Nom Produit ordered'), 'Armz backpack')

'Check Ordered Product Quantity Label'
WebUI.verifyElementText(findTestObject('Object Repository/SHOP Icon/Quantity'), '2 × €28.00')

'Check Ordered Product Subtitle Label'
WebUI.verifyElementText(findTestObject('Object Repository/SHOP Icon/Subtotal'), 'Subtotal:')

'Check Ordered Product Price Label'
WebUI.verifyElementText(findTestObject('Object Repository/SHOP Icon/Total Price'), '€56.00')

'Check "VIEW CART" button Label'
WebUI.verifyElementText(findTestObject('Object Repository/SHOP Icon/View Cart Button'), 'VIEW CART')

'Check "CHECKOUT" button Label'
WebUI.verifyElementText(findTestObject('Object Repository/SHOP Icon/CHECKOUT Button'), 'CHECKOUT')

'Check if "View Cart Button" is clickable'
WebUI.click(findTestObject('Object Repository/SHOP Icon/View Cart Button'))

'back to the Products page'
WebUI.back()

WebUI.waitForPageLoad(5)

'click again on Shop Icon'
WebUI.click(findTestObject('Object Repository/SHOP Icon/SHOP Icon'))

'Check if "CHECKOUT Button" is clickable'
WebUI.click(findTestObject('Object Repository/SHOP Icon/CHECKOUT Button'))

'back to the Products page'
WebUI.back()

WebUI.waitForPageLoad(5)



'Check for dropdown filter menu labels'
'Select All values available in the dropdown by Select All option'
/*WebUI.selectAllOption(findTestObject('Object Repository/Produits/Filtering Combobox'))
WebUI.click(findTestObject('Object Repository/Filtering Options/div_Tri par dfaut'))
'Get number of total option in Facility list'
SelectedItems= WebUI.getNumberOfTotalOption(findTestObject('Object Repository/Produits/Filtering Combobox'))
println('No of Selected Roles are ' + SelectedItems)
WebUI.verifyEqual(SelectedItems, 6)*/


'Check that Default filtering is choosed by default'
WebUI.verifyElementText(findTestObject('Object Repository/Filtering Options/div_Tri par dfaut'),'Tri par défaut')


'filter by popularity'
WebUI.click(findTestObject('Object Repository/Filtering Options/Tri par popularité'))

WebUI.click(findTestObject('Object Repository/Filtering Options/li_Tri par popularit'))

'filter by notes moyennes'
WebUI.click(findTestObject('Object Repository/Filtering Options/Tri par notes moyennes'))

WebUI.click(findTestObject('Object Repository/Filtering Options/li_Tri par notes moyennes'))


'filter from tarif decroissant'
WebUI.click(findTestObject('Object Repository/Filtering Options/Tri du plus récent au plus ancien'))

WebUI.click(findTestObject('Object Repository/Filtering Options/li_Tri plus récent au plus ancien'))

'filter from the most recent to the oldest'
WebUI.click(findTestObject('Object Repository/Filtering Options/Tri par tarif croissant'))

WebUI.click(findTestObject('Object Repository/Filtering Options/li_Tri par tarif croissant'))


'filter from tarif croissant'
WebUI.click(findTestObject('Object Repository/Filtering Options/Tri par tarif décroissant'))

WebUI.click(findTestObject('Object Repository/Filtering Options/li_Tri par tarif décroissant'))

/*
WebUI.verifyElementText(findTestObject('Object Repository/Filtering Options/Tri par popularité'),'Tri par popularité')

WebUI.verifyElementText(findTestObject('Object Repository/Filtering Options/Tri par notes moyennes'),'Tri par notes moyennes')

WebUI.verifyElementText(findTestObject('Object Repository/Filtering Options/Tri du plus récent au plus ancien'),'Tri du plus récent au plus ancien')

WebUI.verifyElementText(findTestObject('Object Repository/Filtering Options/Tri par tarif croissant'),'Tri par tarif croissant')

WebUI.verifyElementText(findTestObject('Object Repository/Filtering Options/Tri par tarif décroissant'),'Tri par tarif décroissant')
*/


/*
'close the browser'
WebUI.closeBrowser()*/



