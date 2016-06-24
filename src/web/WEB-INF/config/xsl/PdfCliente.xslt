<?xml version="1.0" encoding="ISO-8859-1"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:fo="http://www.w3.org/1999/XSL/Format" version="1.0">
	<xsl:output method="fo"/>
	<xsl:template match="/">
		<fo:root xmlns:fo="http://www.w3.org/1999/XSL/Format">
			<fo:layout-master-set>
				<fo:simple-page-master master-name="simple" page-height="29.7cm" page-width="21cm" margin-top="1cm" margin-bottom="2cm" margin-left="2.5cm" margin-right="2.5cm">
					<fo:region-body margin-top="3cm" column-count="1"/>
					<fo:region-before extent="3cm"/>
					<fo:region-after region-name="footer-main" extent="1.5cm"/>
				</fo:simple-page-master>
			</fo:layout-master-set>
			<fo:page-sequence master-reference="simple">
				<fo:static-content flow-name="footer-main">
					<fo:block text-align="center" font-size="12px">- <fo:page-number/> -
					</fo:block>
				</fo:static-content>
				<fo:flow flow-name="xsl-region-body">
					<xsl:apply-templates select="result"/>
				</fo:flow>
			</fo:page-sequence>
		</fo:root>
	</xsl:template>
	<xsl:template match="result">
		<fo:block font-size="14px" font-weight="bold" space-after="12pt">Detalle del Cliente</fo:block>
		<xsl:for-each select="./Clientes">
			<fo:block space-before="6pt" space-after="6pt">
				Código Cliente: <xsl:value-of select="Idcliente"/>
			</fo:block>
			<fo:block space-before="6pt" space-after="6pt">
				Referencia: <xsl:value-of select="ReferenciaClientesParsed"/>
			</fo:block>
			<fo:block space-before="6pt" space-after="6pt">
				CIF: <xsl:value-of select="CifClientesParsed"/>
			</fo:block>
			<fo:block space-before="6pt" space-after="6pt">
				Nombre: <xsl:value-of select="NombreClientesParsed"/>
			</fo:block>
			<fo:block space-before="6pt" space-after="6pt">
				Razón Social: <xsl:value-of select="RazonsocialClientesParsed"/>
			</fo:block>
			<fo:block space-before="6pt" space-after="6pt">
				Persona de Contacto: <xsl:value-of select="ContactoClientesParsed"/>
			</fo:block>					
			<fo:block space-before="6pt" space-after="6pt">
				Dirección: <xsl:value-of select="DireccionClientesParsed"/>	C.P: <xsl:value-of select="CpClientesParsed"/>
				Localidad: <xsl:value-of select="IdlocalidadClientesParsed"/>
			</fo:block>
			<fo:block space-before="6pt" space-after="6pt">
				Fecha de Alta: <xsl:value-of select="FechaaltaClientesParsed"/>
			</fo:block>	
			<fo:block space-before="6pt" space-after="6pt">
				Fecha de Baja: <xsl:value-of select="FechabajaClientesParsed"/>
			</fo:block>						
			<fo:block space-before="6pt" space-after="6pt">
				Teléfono: <xsl:value-of select="TelefonoClientesParsed"/>
			</fo:block>				
			<fo:block space-before="6pt" space-after="6pt">
				Fax: <xsl:value-of select="FaxClientesParsed"/>
			</fo:block>	
			<fo:block space-before="6pt" space-after="6pt">
				Móvil: <xsl:value-of select="MovilClientesParsed"/>
			</fo:block>	
			<fo:block space-before="6pt" space-after="6pt">
				Dirección de correo: <xsl:value-of select="EmailClientesParsed"/>
			</fo:block>		
			<fo:block space-before="6pt" space-after="6pt">
				Dirección Web: <xsl:value-of select="WwwClientesParsed"/>
			</fo:block>		
			<fo:block space-before="6pt" space-after="6pt">
				Observaciones: <xsl:value-of select="ObservacionesClientesParsed"/>
			</fo:block>																			
		</xsl:for-each>	
	</xsl:template>
</xsl:stylesheet>
