import React, { useEffect, useState } from "react";
import HeaderComponent from "../components/HeaderComponent";
import "../sass/HomePage.scss";
import "../sass/Upgrade.scss";
import PlanService from "../services/PlanService";

const PlanUpgrade = () => {
  const [plans, setPlans] = useState([]);
  const getAllPlans = async () => {
    await PlanService.getAllPlans().then((res) => {
      setPlans(res.data);
      console.log(plans);
      console.log(res.data);
    });
  };
  useEffect(() => {
    getAllPlans();
  }, []);
  return (
    <div className="upgrade">
      <div className="home-component">
        <HeaderComponent />
      </div>
      <div className="text-center" style={{ padding: " 100px 10px 10px 10px" }}>
        All product <span className="text-danger fw-bold">30% - 50% OFF</span>
      </div>
      <div className=" text-center fs-2 pt-4 pb-5">
        Choose your plan to get started
      </div>
      <div className="container" style={{padding:" 10px 183px"}}>
        <div class="row row-cols-1 row-cols-md-3 g-4">
          {/* -----------------------------For Looping through map----------------------- */}
          {plans.map((plan) => {
            const button=plan.name.toUpperCase();
            return (
              <div class="col">
                <div class="card h-100" width="28 rem">
                  <div className="ribbon-style">
                    <div class="ribbon red">
                      <span>30% OFF</span>
                    </div>
                  </div>
                  <div class="card-body  text-center">
                    <h5 class="card-title planTitle">{plan.name}</h5>
                    <p className="fs-5" style={{ marginTop: "-18px" }}>
                     {plan.noOfUsers} user
                    </p>
                    <p style={{ fontSize: "small" }}>1 TB ({plan.storageAsMb} GB)</p>
                    <p className="text-decoration-line-through fs-5">
                      ${plan.price}/month
                    </p>
                    <p className="fw-bold fs-4" style={{ color: "#d9173a" }}>
                      {" "}
                      ${plan.price}/month
                    </p>
                    <p className="pt-4 pb-4">
                      {plan.description}
                    </p>
                  </div>
                  <div
                    class="card-footer text-center border-0"
                    style={{ textAlign: "center" }}
                  >
                    <button
                      className="btn btn-primary fs-5 fw-bolder"
                      style={{
                        width: "251px",
                        height: "48px",
                        backgroundColor: "#0070f0",
                        borderRadius: "3px",
                      }}
                    >
                      GET {button}
                    </button>
                  </div>
                  <div class="card-footer">
                    <small class="text-muted">Last updated 3 mins ago</small>
                  </div>
                </div>
              </div>
            );
          })}
          {/* -----------------------------For Looping through map----------------------- */}
          {/* ---------------------------c1--------------------------------- */}
          <div class="col">
            <div class="card h-100" width="28 rem">
              <div className="ribbon-style">
                <div class="ribbon red">
                  <span>your data</span>
                </div>
              </div>
              <div class="card-body  text-center">
                <h5 class="card-title planTitle">Pro</h5>
                <p className="fs-5" style={{ marginTop: "-18px" }}>
                  1 user
                </p>
                <p style={{ fontSize: "small" }}>1 TB (1000 GB)</p>
                <p className="text-decoration-line-through fs-5">$8.33/month</p>
                <p className="fw-bold fs-4" style={{ color: "#d9173a" }}>
                  {" "}
                  $5.83/month
                </p>
                <p className="pt-4 pb-4">
                  billed annually or $6.99 month-to-month
                </p>
              </div>
              <div
                class="card-footer text-center border-0"
                style={{ textAlign: "center" }}
              >
                <button
                  className="btn btn-primary "
                  style={{
                    width: "251px",
                    height: "48px",
                    backgroundColor: "#0070f0",
                    borderRadius: "3px",
                  }}
                >
                  Get Pro
                </button>
              </div>
              <div class="card-footer">
                <small class="text-muted">Last updated 3 mins ago</small>
              </div>
            </div>
          </div>
          {/* ---------------------------c2--------------------------------- */}
          <div class="col">
            <div class="card h-100">
              <div className="ribbon-style">
                <div class="ribbon red">
                  <span>30% OFF</span>
                </div>
              </div>
              <div class="card-body text-center">
                <h5 class="card-title  planTitle ">Business</h5>
                <p className="fs-5 " style={{ marginTop: "-18px" }}>
                  100 user
                </p>
                <p style={{ fontSize: "small" }}>2 TB (1000 GB)</p>
                <p className="text-decoration-line-through fs-5">
                  $100.00/month
                </p>
                <p className="fw-bold fs-4" style={{ color: "#d9173a" }}>
                  $50.00/month
                </p>
                <p className="pt-4 pb-4">billed monthly</p>
              </div>
              <div
                class="card-footer text-center border-0"
                style={{ textAlign: "center" }}
              >
                <button
                  className="btn btn-primary "
                  style={{
                    width: "251px",
                    height: "48px",
                    backgroundColor: "#0070f0",
                    borderRadius: "3px",
                  }}
                >
                  Get Pro
                </button>
              </div>
              <div class="card-footer">
                <small class="text-muted">Last updated 3 mins ago</small>
              </div>
            </div>
          </div>
          {/* ---------------------------c3--------------------------------- */}
          <div class="col">
            <div class="card h-100">
              <div className="ribbon-style">
                <div class="ribbon red">
                  <span>50% OFF</span>
                </div>
              </div>
              <div class="card-body text-center ">
                <h5 class="card-title  planTitle ">Basic</h5>
                <p className="fs-5" style={{ margin: "80px 0px" }}>
                  10 GB
                </p>
              </div>
              <div
                class="card-footer text-center border-0"
                style={{ textAlign: "center" }}
              >
                <button
                  className="btn btn-primary "
                  style={{
                    width: "251px",
                    height: "48px",
                    backgroundColor: "#0070f0",
                    borderRadius: "3px",
                  }}
                >
                  Get Pro
                </button>
              </div>
              <div class="card-footer">
                <small class="text-muted">Last updated 3 mins ago</small>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  );
};

export default PlanUpgrade;
