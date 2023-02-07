import axios from "axios";

const baseUrl = "http://192.168.2.145:9999/mediafire";

class PlanService {
  getAllPlans() {
    return axios.get(baseUrl + "/plan/user/list");
  }
}
export default new PlanService();
