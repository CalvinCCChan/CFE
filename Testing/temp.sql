# Lines of Text 
--------------- 
4               


text                                                                                                                                                                                                                                                            
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- 
/*

 *

 * Description:  Team M process Team S request - Exception report

 * Developer:   Cicely Leung

 * Date:        6/04/2009

 *

 * Date         Description			      Developer

 * ----------------------------------------------------------

 * 06/04/ 
2009   AA-AA010832               Cicely Leung

*/

 

create proc po_team_m_process_s_except_rpt

as

begin 



   declare @ls_cycle_date datetime   

   select @ls_cycle_date=current_cycle_date from aidcconfig..tcycle_dates



   select a.policyno, conve 
rt(char(10),a.request_date,101) as request_date  , b.team, a.user_id, convert(char(10),a.last_upd_cycle_date,101) as last_upd_cycle_date , a.complete_flg

   from pos..tpos_team_m_process_s_log a, pos..posmast b

   where a.policyno = b.policyno

   and a 
.request_date = b.request_date

   and b.team='M'

   and a.complete_flg not in ('N','Y','C')

   and a.last_upd_cycle_date = @ls_cycle_date

     

end  

                                                                                                    


Execution time: 0.141 seconds
