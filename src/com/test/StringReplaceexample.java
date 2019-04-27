package com.test;

public class StringReplaceexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String templateString = " Hi $PersonName$, <p> <b>Subject : </b> <i> Adverse Event Occurrence </i></p><p> <i> This email is sent to you as to intimate about Adverse Event Occurrence </i></p><p> <b> Subject Number:</b> $SUBJECTNO$ </p><p> <b> Visit Name:</b> $VISITNAME$ </p><p> <b> AE Name:</b> $AENAME$ </p><p> <b> Is Serious:</b> $ISAESERIOUS$ </p><p> <b> Event Description:</b> $AEDESC$ </p><p> <i> This is an auto-generated email. please do not reply. </i></p><p> <i> Regards. </i></p><p> <i> <b>Administrator </b> </i></p><p> <b>  Alpha Clinical Systems Management Solution </b></p>";
		String templateString = "{{PersonName}} a {{PersonName}} b {{PersonName}}";
    	templateString = templateString.replace("{{PersonName}}", "chandu");
    	/*templateString = templateString.replaceAll("$SUBJECTNO$", "001234");
    	templateString = templateString.replaceAll("$VISITNAME$", "S1");
    	templateString = templateString.replaceAll("$AENAME$", "AE VVV");
    	templateString = templateString.replaceAll("$AEDESC$", "Description");
    	templateString = templateString.replaceAll("$ISAESERIOUS$", "Yes");*/
    	System.out.println(templateString);
	}

}
