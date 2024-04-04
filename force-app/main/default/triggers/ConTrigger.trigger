trigger ConTrigger on Contact (after insert, after update, after undelete , after delete ) {
    
    List<Contact> conlist = new List<contact>(); 
    
    if( Trigger.isInsert || Trigger.isUndelete ) 
    {
        conlist.addAll(Trigger.new);
    }
     if( Trigger.IsDelete)
     {
        conlist.addAll(Trigger.old);
     }
    if(Trigger.IsUpdate)
    {
        conlist.addAll(Trigger.new);
        conlist.addAll(Trigger.old);
    }
    
    Set<id> accIdset = new  Set<id>();
    
    for(Contact con : conlist) 
    {
        accIdset.add(con.accountId);
    }
    
    List<Account> accList = [Select Name,No_Of_Contacts__c, (select Name from Contacts) from Account WHERE Id IN :accIdset];
    
    for(Account acc : accList) 
    {
        acc.No_of_contacts__c = acc.contacts.size();
    }
    
    update accList;
}