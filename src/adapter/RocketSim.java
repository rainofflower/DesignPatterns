package adapter;

/** @pdOid 68c922fb-0022-485b-ab31-3f846a71e1e8 */
public interface RocketSim {
   /** @pdOid 45a9b588-0f52-4ab3-ad52-bcaccd56c0f3 */
   double getMass();
   /** @pdOid 0f95137e-360f-4cf7-b41e-9c98840e68f4 */
   double getThrust();
   /** @param t
    * @pdOid 828a2977-56b4-48b5-a464-62596fde1c13 */
   void setSimTime(double t);

}